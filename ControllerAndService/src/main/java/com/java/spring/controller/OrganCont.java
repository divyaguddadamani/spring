package com.java.spring.controller;

import com.java.spring.dto.OrganDto;
import com.java.spring.service.OrganService;
import com.java.spring.service.OrganServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OrganCont {
    @Autowired
    private OrganService organService;
    public OrganCont()
    {
        System.out.println("created OrganCont");
    }

@RequestMapping("/donate")
    public String donateOrgan(OrganDto dto)
    {
        System.out.println("running  donate in comp");
        System.out.println(dto.toString());
        boolean result=this.organService.save(dto);
        if(result)
        {
            System.out.println("saved"+result);
        }
        else {
            System.out.println("not saved");
        }
        return "Donation.jsp";
    }
}
