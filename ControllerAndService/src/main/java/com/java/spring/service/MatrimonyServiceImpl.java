package com.java.spring.service;

import com.java.spring.dto.MatrimonyDto;
import org.springframework.stereotype.Service;

@Service
public class MatrimonyServiceImpl implements MatrimonyService{
    @Override
    public boolean saveAndValid(MatrimonyDto dto) {
        return true;
    }
}
