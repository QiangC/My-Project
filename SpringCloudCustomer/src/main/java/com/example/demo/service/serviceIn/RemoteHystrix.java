package com.example.demo.service.serviceIn;

import com.example.demo.service.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: 陈强
 * Date: 2019/3/25
 * Time: 9:23
 * To change this template use File | Settings | File Templates.
 */
@Component
public class RemoteHystrix implements HelloRemote {

    @Override
    public String index(@RequestParam(value = "name") String name) {
        return "hello: " +name+", this messge send failed ";
    }
}
