package com.smarter.sell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@ResponseBody
@Controller
public class TestController {

    @GetMapping("/test1")
    public String test(){
        System.out.println("写了行测试代码");
        return "hello world";
    }

}
