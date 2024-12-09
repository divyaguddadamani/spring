package com.java.spring.service;

import com.java.spring.dto.DeathCertificateDto;
import org.springframework.stereotype.Service;

@Service
public class DeathSerImpl implements DeathSer{
    @Override
    public boolean saveAndValid(DeathCertificateDto dto) {
        return true;
    }
}
