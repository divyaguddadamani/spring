package com.java.spring.controller;

import com.java.spring.dto.RoomDto;
import com.java.spring.service.RoomService;
import com.java.spring.service.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RoomCont {
    @Autowired
    private RoomService roomService;

    public RoomCont() {
        System.out.println("created RoomCont");
    }


    @RequestMapping("/book")
    public String onBook(RoomDto dto) {
        System.out.println("run on book");
        System.out.println(dto.toString());
        boolean result = this.roomService.Validate(dto);
        if (result) {
            System.out.println("saved" + result);
        } else {
            System.out.println("not saved");
        }

        return "RoomBook.jsp";
    }
}
