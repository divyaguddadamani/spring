package com.java.spring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PassportDto {
    private String registrationType;
    private String passportOffice;
    private String givenName;
    private String surname;
    private String dateOfBirth;
    private String email;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;
}
