package com.example.demo.mapper;

import com.example.demo.dto.StudentResponse;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class    StudentViewMapper {
    public StudentResponse viewStudent(Student student) {
        if (student == null) {
            return null;
        }
        StudentResponse response = new StudentResponse();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setEmail(student.getEmail());
        response.setAge(student.getAge());
        response.setSurname(student.getSurname());
        response.setActive(student.isActive());
        response.setCreated(student.getCreated());
        return response;
    }
    public List<StudentResponse> view(List<Student>students){
        List<StudentResponse> responses=new ArrayList<>();
        for (Student student:students) {
            responses.add(viewStudent(student));
        }
        return responses;
    }
}
