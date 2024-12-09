package com.java.spring.service;

import com.java.spring.dto.JobDto;
import org.springframework.stereotype.Service;

@Service
public interface JobService {
    boolean saveAndValid(JobDto dto);

}
