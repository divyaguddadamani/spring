package com.java.spring.service;

import com.java.spring.dto.DeathCertificateDto;
import org.springframework.stereotype.Service;

@Service
public interface DeathSer {
    boolean saveAndValid(DeathCertificateDto dto);

}
