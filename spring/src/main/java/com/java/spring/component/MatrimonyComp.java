package com.java.spring.component;

import com.java.spring.dto.MatrimonyDto;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MatrimonyComp {
    @RequestMapping("send")
    public String sendDetails(MatrimonyDto dto)
    {
        System.out.println("run sendDetails");
        System.out.println(dto.toString());
        return "Matrimony.jsp";
    }
}
