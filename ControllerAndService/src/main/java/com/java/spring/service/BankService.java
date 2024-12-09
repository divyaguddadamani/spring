package com.java.spring.service;

import com.java.spring.dto.BankDto;
import org.springframework.stereotype.Service;

@Service
public interface BankService {
    boolean validAndSave(BankDto dto);
}
