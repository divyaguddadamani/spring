package com.java.spring.service;

import com.java.spring.dto.RoomDto;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService{
    @Override
    public boolean Validate(RoomDto dto) {
        return true;
    }
}
