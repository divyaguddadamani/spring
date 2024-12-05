package com.java.spring.component;

import com.java.spring.dto.RoomDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class RoomComp {

    @RequestMapping("book")
    public String onBook(RoomDto dto)
    {
        System.out.println("run on book");
        System.out.println(dto.toString());
        return "RoomBook.jsp";
    }
}
