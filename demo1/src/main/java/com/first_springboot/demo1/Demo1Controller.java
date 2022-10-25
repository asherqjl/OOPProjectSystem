package com.first_springboot.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello what r u";
    }
}
