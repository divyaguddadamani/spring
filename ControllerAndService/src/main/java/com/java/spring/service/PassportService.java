package com.java.spring.service;

import com.java.spring.dto.BankDto;
import com.java.spring.dto.PassportDto;
import org.springframework.stereotype.Service;

@Service
public interface PassportService {
    boolean validAndSave(PassportDto dto);
}
