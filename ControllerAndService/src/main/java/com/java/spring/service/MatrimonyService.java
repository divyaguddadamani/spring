package com.java.spring.service;

import com.java.spring.dto.MatrimonyDto;
import org.springframework.stereotype.Service;

@Service
public interface MatrimonyService {
    boolean saveAndValid(MatrimonyDto dto);
}
