package com.example.application2;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api2")
@RestController
public class StudentController {
    @PostMapping("/Student/save")
    public Student save(Student student){
        student.setFirstname("Phanindra");
        student.setLastname("chandra");
        return student;
    }
}
