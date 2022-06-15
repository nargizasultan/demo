package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StudentResponse {

    private Long id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private LocalDate created;
    private boolean isActive;
}
