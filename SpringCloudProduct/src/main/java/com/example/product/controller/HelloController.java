package com.example.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 陈强
 * Date: 2019/3/11
 * Time: 11:34
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index(@RequestParam String name) {
        return "你好呀！"+name+"，this is first messge";
    }

}
