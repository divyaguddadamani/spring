package com.java.spring.service;

import com.java.spring.dto.BankDto;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService{
    @Override
    public boolean validAndSave(BankDto dto) {
        return true;
    }
}
