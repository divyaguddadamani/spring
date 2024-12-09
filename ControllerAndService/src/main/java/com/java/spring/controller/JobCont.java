package com.java.spring.controller;

import com.java.spring.dto.JobDto;
import com.java.spring.service.JobService;
import com.java.spring.service.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JobCont {
    @Autowired

    private JobService jobService;

    public JobCont()
    {
        System.out.println("created JobCont");

    }

    @RequestMapping("/apply")
    public String onApply(JobDto dto)
    {
        System.out.println("run on apply in jobcomp");
        String value=dto.toString();
        System.out.println(value);
        boolean save=this.jobService.saveAndValid(dto);
        if(save)
        {
            System.out.println("data saved"+save);

        }
        else {
            System.out.println("not saved");
        }
        return "Job.jsp";
    }
}
