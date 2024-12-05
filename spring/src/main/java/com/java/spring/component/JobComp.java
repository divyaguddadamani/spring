package com.java.spring.component;

import com.java.spring.dto.JobDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class JobComp {
    public JobComp()
    {
        System.out.println("created");

    }

    @RequestMapping("apply")
    public String onApply(JobDto dto)
    {
        System.out.println("run on apply in jobcomp");
        String value=dto.toString();
        System.out.println(value);
        return "Job.jsp";
    }
}
