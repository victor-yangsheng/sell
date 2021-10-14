package com.smarter.sell.controller;

import com.smarter.sell.entities.ProductCategory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

@RequestMapping("/test")
@ResponseBody
@Controller
public class TestController {

    @Value("${ca.test.one}")
    private String one;
    @Value("${ca.test.one-a}")
    private String two;

    @GetMapping("/test1")
    public ProductCategory test(){
        System.out.println("写了行测试代码");

        ProductCategory productCategory = new ProductCategory();

        return productCategory;
    }

    public static void main(String[] args) {
        ProductCategory productCategory = new ProductCategory();
        Optional<ProductCategory> productCategory1 = Optional.ofNullable(productCategory);
        ArrayList<Object> objects = new ArrayList<>();

        Optional<Object> any = objects.stream().findAny();
        boolean present = any.isPresent();
        if(present){

        }
    }
}
