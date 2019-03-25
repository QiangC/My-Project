package com.example.demo.controller;

import com.example.demo.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 陈强
 * Date: 2019/3/11
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class CustomerController {
    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/index/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.index(name);
    }

}
