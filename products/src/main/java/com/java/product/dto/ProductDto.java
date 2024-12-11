package com.java.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
public class ProductDto {
    private String name;
    private String type;
    private String cost;
    private String manf;
    private String  manfDate;
    private String warranty;
}
