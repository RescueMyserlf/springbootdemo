package com.example.demo;

import com.example.demo.entity.Propertise;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by tiea on 2018/7/5.
 */
@RestController
public class HelloController {

    @Resource
    private Propertise propertise;

    @RequestMapping("/hello/{id}")
    public String hello(@PathVariable("id") String id) {
        return "hello,this is a springboot demo wahahaaaaaaaaaa"+propertise.getName()+propertise.getNickname()+id;
    }

}
