package com.example.demo.mapper;

import com.example.demo.dto.StudentRequest;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class StudentEditMapper {
    public Student create(StudentRequest request){
        if (request==null){
            return null;
        }
        Student student=new Student();
        student.setName(request.getName());
        student.setAge(request.getAge());
        student.setEmail(request.getEmail());
        student.setSurname(request.getSurname());
        student.setCreated(LocalDate.now());
        student.setActive(true);
        return student;

    }
    public void update(Student student, StudentRequest request){
        student.setName(request.getName());
        student.setAge(request.getAge());
        student.setEmail(request.getEmail());
        student.setSurname(request.getSurname());
    }


}
