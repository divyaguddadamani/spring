package com.java.spring.controller;

import com.java.spring.dto.HospitalDto;
import com.java.spring.service.HospitalSerImpl;
import com.java.spring.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalCont {
    @Autowired

    private HospitalService hospitalService;

    public HospitalCont()
    {
        System.out.println("created HospitalCont");
    }

    @RequestMapping("/admit")
    public String OnAdmit(HospitalDto dto)
    {
        System.out.println("run on apply in HospitalCont");
        String value=dto.toString();
        System.out.println(value);
        boolean save=this.hospitalService.SaveAndValidate(dto);
        if(save)
        {
            System.out.println("data saved"+save);

        }
        else {
            System.out.println("not saved");
        }
        return "Hospital.jsp";
    }
}
