package com.example.demo.service;

import com.example.demo.service.serviceIn.RemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: 陈强
 * Date: 2019/3/11
 * Time: 14:48
 * To change this template use File | Settings | File Templates.
 */
@Component
@FeignClient(name= "spring-cloud-producer",fallback = RemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/index")//调用生产者路径
    String index(@RequestParam(value = "name") String name);

}
