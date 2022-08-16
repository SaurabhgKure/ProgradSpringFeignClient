package com.example.feign2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app2")
@RestController
public class SudentController {

    @PostMapping("/student/save")
    public Student save(Student student){
        student.setFirstName("Akshay");
        student.setFirstName("Kumar");
        return student;
    }


}
