package com.java.spring.service;

import com.java.spring.dto.JobDto;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {
    @Override
    public boolean saveAndValid(JobDto dto) {
        return true;
    }
}
