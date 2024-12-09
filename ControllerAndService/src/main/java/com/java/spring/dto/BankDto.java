package com.java.spring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Data
@NoArgsConstructor

public class BankDto {

private String name;
private String Account;
private int Balance;

}
