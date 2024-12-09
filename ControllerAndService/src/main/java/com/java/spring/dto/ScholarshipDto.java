package com.java.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@Component
public class ScholarshipDto {

    private String name;
    private int age;
    private String email;
    private long phone;
    private String usn;

}
