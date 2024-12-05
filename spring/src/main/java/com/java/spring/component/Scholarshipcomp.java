package com.java.spring.component;

import com.java.spring.dto.ScholarshipDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Scholarshipcomp {

    public Scholarshipcomp(){

        System.out.println("created");

    }
    @RequestMapping  ("/submit")
            public String  apply(ScholarshipDto dto) {
        System.out.println("created apply");
        System.out.println(dto.toString());
        return "Scholarship.jsp";
    }
}
