package com.java.spring.service;

import com.java.spring.dto.RoomDto;
import org.springframework.stereotype.Service;

@Service
public interface RoomService {
    boolean Validate(RoomDto dto);
}
