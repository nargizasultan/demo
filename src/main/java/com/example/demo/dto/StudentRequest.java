package com.example.demo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {
    private String name;
    private String surname;
    private int age;
    private String email;
}
