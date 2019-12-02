package com.wlx.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
public class IndexController {

    @RequestMapping("/app/index")
    public String index(){
        System.out.println("aaaaaaaaa");
        return "cccccccccccc";
    }
}
