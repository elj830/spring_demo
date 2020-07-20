package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

@RestController
public class PagesController {

       @GetMapping("/hello")
        public String helloGet(){
            return "Hello from a Get";
        }
        @GetMapping("/math/pi")
        public String mathPi(){
            return "3.141592653589793";
        }
        @GetMapping("/name")
        public String getNames(
                @RequestParam(value ="fName", required = false, defaultValue = "unknown") String firstName,
                @RequestParam(value ="lName", required = false, defaultValue = "unknown") String lastName
                ){
               return "Hello " + firstName + " " + lastName;
            }
        @GetMapping("/math/calculate")
        public String calculate(
                @RequestParam(value ="operation", required = true, defaultValue = "add") String op,
                @RequestParam(value ="x", required = false, defaultValue = "1") int x,
                @RequestParam(value ="y", required = false, defaultValue = "1") int y
        ){
           String result = "";
            System.out.println(op);
           if(op.equals("add")) {
               result = Integer.toString(x) + " + " + Integer.toString(y) + " = " + Integer.toString(x + y);
               System.out.println("In add");
           }
            if(op.equals("subtract")) {
                result = Integer.toString(x) + " - " + Integer.toString(y) + " = " + Integer.toString(x - y);
                System.out.println("In sub");
            }
            if(op.equals("multiply")) {
                result = Integer.toString(x) + " x " + Integer.toString(y) + " = " + Integer.toString(x * y);
                System.out.println("In multiply");
            }
            if(op.equals("divide")) {
                result = Integer.toString(x) + " / " + Integer.toString(y) + " = " + Integer.toString(x / y);
                System.out.println("In div");
            }

           return result;
        }
}
