package com.java.spring.controller;

import com.java.spring.dto.PassportDto;
import com.java.spring.service.PassportService;
import com.java.spring.service.PassportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {
    @Autowired
    private PassportService passportService;
    public PassportController(){
        System.out.println("created no argu const PassportController");
    }
    @RequestMapping("/passport")
    public String apply(PassportDto dto){
        System.out.println("created apply");
        System.out.println(dto.toString());
        boolean result=this.passportService.validAndSave(dto);
        if(result)
        {
            System.out.println("saved"+result);
        }
        else {
            System.out.println("not saved");
        }
        return "Passport.jsp";
    }


}

