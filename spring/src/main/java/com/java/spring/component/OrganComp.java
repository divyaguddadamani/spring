package com.java.spring.component;

import com.java.spring.dto.OrganDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")

public class OrganComp {
    public OrganComp()
    {
        System.out.println("created");
    }

@RequestMapping("donate")
    public String donateOrgan(OrganDto dto)
    {
        System.out.println("running  donate in comp");
        System.out.println(dto.toString());
        return "Donation.jsp";
    }
}
