package com.java.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class DeathCertificateDto {
    private String name;
    private  int age;
    private String add;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private LocalDate dob;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private LocalDate lastdate;
    private String cause;
}
