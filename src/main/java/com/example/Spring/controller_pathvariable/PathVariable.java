package com.example.Spring.controller_pathvariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariable {

    @RequestMapping("/hello/{name}")
    public String message(@org.springframework.web.bind.annotation.PathVariable String name){
        return "Welcome to India."+name;

    }

    @RequestMapping("/check_age/{age}")
    public String checkAge(@org.springframework.web.bind.annotation.PathVariable int age){
        if (age>18){
            return "You are young";
        }
        else{
            return "you are child";
        }

    }

    @RequestMapping("/your_salary/{salary}")
    public String checkSalary(@org.springframework.web.bind.annotation.PathVariable int salary){
        if (salary>100000){
            return "Your package is high.";
        }
       else{
           return "your salary is low.";
        }



    }


}
