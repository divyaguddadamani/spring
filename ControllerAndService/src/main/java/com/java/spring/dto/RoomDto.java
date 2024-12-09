package com.java.spring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoomDto {
    private String name;
    private String email;
    private long phone;
}
