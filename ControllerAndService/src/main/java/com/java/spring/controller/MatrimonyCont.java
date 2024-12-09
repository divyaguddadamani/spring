package com.java.spring.controller;

import com.java.spring.dto.MatrimonyDto;
import com.java.spring.service.MatrimonyService;
import com.java.spring.service.MatrimonyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MatrimonyCont {
    @Autowired
    private MatrimonyService matrimonyService;
    public  MatrimonyCont(){

        System.out.println("created MatrimonyCont");
    }
    @RequestMapping("/send")
    public String sendDetails(MatrimonyDto dto)
    {
        System.out.println("run sendDetails");
        System.out.println(dto.toString());
        boolean value=this.matrimonyService.saveAndValid(dto);
        if(value)
        {
            System.out.println("saved"+value);
        }
        else {
            System.out.println("not saved");
        }
        return "Matrimony.jsp";
    }
}
