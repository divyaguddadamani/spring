package com.java.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

public class ScholarshipDto {

    private String name;
    private int age;
    private String email;
    private long phone;
    private String usn;

}
