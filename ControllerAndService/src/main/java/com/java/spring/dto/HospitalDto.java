package com.java.spring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HospitalDto {
    private String name;
    private int age;
    private long phone;
    private String add;
    private char gender;
    private String bloodgroup;

}
