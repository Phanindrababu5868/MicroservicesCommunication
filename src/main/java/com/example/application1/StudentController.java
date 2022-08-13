package com.example.application1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api1")
@RestController
public class StudentController {
    @Autowired
    StudentService Studentservice;
    @GetMapping("/Student/send")
    public Student save(){
        Student student =new Student();
        student.setFirstname("Indra");
        student.setLastname("alluri");
        return Studentservice.save(student);
    }

}
