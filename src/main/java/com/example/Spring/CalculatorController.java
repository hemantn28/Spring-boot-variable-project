package com.example.Spring;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add/{a}/{b}")
    public String addition(@PathVariable int a, @PathVariable int b){
        return "addition is: "+(a+b);
    }


    @RequestMapping("/addition/{a}/{b}")
    public int plus(@PathVariable int a, @PathVariable int b){
        int c=a+b;
        return c;
    }

    @RequestMapping("/division/{a}/{b}")
    public String divide(@PathVariable double a, @PathVariable double b){
       return "division is: "+(a/b);
    }

    @RequestMapping("/by/{a}/{b}")
    public double divide2(@PathVariable double a, @PathVariable double b){
        double c=a/b;
        return c;

    }

    @RequestMapping("/subtraction/{a}/{b}")
    public String subtract(@PathVariable int a, @PathVariable int b){
        int c=a-b;
        return "subtraction is: "+c;

    }

    @RequestMapping("/minus/{a}/{b}")
    public int subtract2(@PathVariable int a, @PathVariable int b){
        int c=a-b;
        return c;

    }

    @RequestMapping("/multiplication/{a}/{b}")
    public String multiply(@PathVariable int a, @PathVariable int b){
     return "multiplication is: "+(a*b);
    }

    @RequestMapping("/into/{a}/{b}")
    public float multiply2(@PathVariable float a, @PathVariable float b){
        float c=a*b;
        return c;
    }


}
