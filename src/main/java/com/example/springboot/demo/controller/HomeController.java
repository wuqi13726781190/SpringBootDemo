package com.example.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController注解说明Controller的返回都是以JSON格式，免去自己配置类似jackson的json包
public class HomeController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

}
