package com.java.spring.service;

import com.java.spring.dto.PassportDto;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService {
    public boolean validAndSave(PassportDto dto){
        return true;
    }
}
