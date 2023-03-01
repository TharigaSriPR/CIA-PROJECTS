package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name{
   @GetMapping("/hello/{str}")
   public String Name(@PathVariable String str)
   {
     return "Hello"+str+"!";
   }
}


