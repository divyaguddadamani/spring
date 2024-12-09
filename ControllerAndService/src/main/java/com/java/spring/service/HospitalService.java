package com.java.spring.service;

import com.java.spring.dto.HospitalDto;
import org.springframework.stereotype.Service;

@Service
public interface HospitalService {
    boolean SaveAndValidate(HospitalDto dto);
}
