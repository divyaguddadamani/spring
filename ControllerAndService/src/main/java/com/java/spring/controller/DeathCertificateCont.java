package com.java.spring.controller;

import com.java.spring.dto.DeathCertificateDto;
import com.java.spring.service.DeathSer;
import com.java.spring.service.DeathSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeathCertificateCont {

    @Autowired

    private DeathSer deathSer;

    public DeathCertificateCont()
    {
        System.out.println("created DeathCertificateCont");
    }

    @RequestMapping("/save")
    public String OnSave(DeathCertificateDto dto)
    {
    System.out.println("running OnSave");
    boolean show=this.deathSer.saveAndValid(dto);
    if(show)
    {
        System.out.println("saved"+show);
    }
    else {
        System.out.println("not saved");
    }
    return "DeathCertificate.jsp";

    }

}
