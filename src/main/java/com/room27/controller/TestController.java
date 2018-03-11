package com.room27.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 27room
 * @date 2018/03/10 16:57
 */
@RestController
@RequestMapping
public class TestController {

    @RequestMapping("/a/b/c.do")
    public String testMe(){
        System.out.println("helloworld");
        return "SUCCESS";
    }

}
