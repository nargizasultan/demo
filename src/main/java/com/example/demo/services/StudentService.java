package com.example.demo.services;

import com.example.demo.dto.StudentRequest;
import com.example.demo.dto.StudentResponse;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentEditMapper;
import com.example.demo.mapper.StudentViewMapper;
import com.example.demo.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentEditMapper editMapper;
    private final StudentViewMapper viewMapper;

    public StudentResponse create(StudentRequest request) {
        Student student = editMapper.create(request);
        studentRepository.save(student);
        return viewMapper.viewStudent(student);
    }

    public StudentResponse update(long id, StudentRequest request) {
        Student student = studentRepository.findById(id).get();
        editMapper.update(student, request);
        studentRepository.save(student);
        return viewMapper.viewStudent(studentRepository.save(student));
    }

    public StudentResponse findById(long id) {
        Student student = studentRepository.findById(id).get();
        return viewMapper.viewStudent(student);
    }
    public StudentResponse deleteById(long id) {
        Student student = studentRepository.getById(id);
        studentRepository.delete(student);
        return viewMapper.viewStudent(student);
    }
    public List<StudentResponse> getAllStudents(){
        return viewMapper.view(studentRepository.findAll());
    }

}
