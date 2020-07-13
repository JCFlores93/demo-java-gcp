package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello() throws UnknownHostException {
        return "Hello world" + InetAddress.getLocalHost();
    }

}
