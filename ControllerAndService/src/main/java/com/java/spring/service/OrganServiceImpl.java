package com.java.spring.service;

import com.java.spring.dto.OrganDto;
import org.springframework.stereotype.Service;

@Service
public class OrganServiceImpl implements OrganService{
    @Override
    public boolean save(OrganDto dto) {
        return true;
    }
}
