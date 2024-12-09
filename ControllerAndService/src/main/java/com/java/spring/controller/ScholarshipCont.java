package com.java.spring.controller;

import com.java.spring.dto.ScholarshipDto;
import com.java.spring.service.ScholarShipSer;
import com.java.spring.service.ScholarShipSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ScholarshipCont {
    @Autowired
    private ScholarShipSer scholarShipSer;

     public ScholarshipCont(){
         System.out.println("Scholar Ship const");
     }

    @RequestMapping("/register")
    public String apply(ScholarshipDto dto) {
        System.out.println("created apply");
        System.out.println(dto.toString());
        boolean result = this.scholarShipSer.saveAndValid(dto);
        if (result) {
            System.out.println("saved" + result);
        } else {
            System.out.println("not saved");
        }
        return "Scholarship.jsp";
    }
}
