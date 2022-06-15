package com.example.demo.controller;

import com.example.demo.dto.StudentRequest;
import com.example.demo.dto.StudentResponse;
import com.example.demo.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService service;
    @PostMapping
    public StudentResponse create(@RequestBody StudentRequest request){
        return service.create(request);

    }
    @PutMapping("{id}")
    public StudentResponse update(@PathVariable long id,  @RequestBody StudentRequest request){
        return service.update(id, request);

    }
    @GetMapping("{id}")
    public StudentResponse findById(@PathVariable long id){
        return service.findById(id);

    }
    @DeleteMapping("{id}")
    public StudentResponse delete(@PathVariable long id){
        return service.deleteById(id);

    }
    @GetMapping
    public List<StudentResponse> getAllStudents(){
        return service.getAllStudents();
    }

}
