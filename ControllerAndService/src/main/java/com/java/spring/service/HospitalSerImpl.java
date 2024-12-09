package com.java.spring.service;

import com.java.spring.dto.HospitalDto;
import org.springframework.stereotype.Service;

@Service
public class HospitalSerImpl implements HospitalService{
    @Override
    public boolean SaveAndValidate(HospitalDto dto) {
        return true;
    }
}
