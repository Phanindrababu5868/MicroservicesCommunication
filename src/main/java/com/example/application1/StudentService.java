package com.example.application1;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Headers("content-Type:application/json")
@FeignClient(name = "${feign.name}",url="${feign.url}")
public interface StudentService {
    @RequestMapping(value = "/api2/Student/save", method = RequestMethod.POST)
    Student save(Student student);

}
