package com.java.spring.service;

import com.java.spring.dto.ScholarshipDto;
import org.springframework.stereotype.Service;

@Service
public class ScholarShipSerImpl implements ScholarShipSer{
    @Override
    public boolean saveAndValid(ScholarshipDto dto) {
        return true;
    }
}
