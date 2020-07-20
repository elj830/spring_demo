package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
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
}
