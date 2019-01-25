package com.ming.personal.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value = "/ping")
public class Ping {

    @RequestMapping(value = "/pang")
    public String hello() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "pang  , boot , personal : " + df.format(new Date());
    }
}
