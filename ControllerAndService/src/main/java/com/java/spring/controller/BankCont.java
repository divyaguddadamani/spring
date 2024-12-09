package com.java.spring.controller;

import com.java.spring.dto.BankDto;
import com.java.spring.service.BankService;
import com.java.spring.service.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankCont {

    @Autowired
    private BankService bankService;

    public BankCont()
    {
        System.out.println("created Bankcont");
    }
    @RequestMapping("/account")
    public String Onlogin(BankDto dto)
    {
        System.out.println("run on apply in jobcomp");
        String value=dto.toString();
        System.out.println(value);
        boolean save=this.bankService.validAndSave(dto);
        if(save)
        {
            System.out.println("data saved"+save);

        }
        else {
            System.out.println("not saved");
        }
        return "Bank.jsp";
    }

}
