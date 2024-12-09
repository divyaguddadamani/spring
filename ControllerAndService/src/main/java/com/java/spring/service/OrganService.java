package com.java.spring.service;


import com.java.spring.dto.OrganDto;
import org.springframework.stereotype.Service;

@Service
public interface OrganService {
boolean save(OrganDto dto);
}
