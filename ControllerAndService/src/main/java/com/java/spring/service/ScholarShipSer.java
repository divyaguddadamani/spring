package com.java.spring.service;

import com.java.spring.dto.ScholarshipDto;
import org.springframework.stereotype.Service;

@Service
public interface ScholarShipSer {
    boolean saveAndValid(ScholarshipDto dto);
}