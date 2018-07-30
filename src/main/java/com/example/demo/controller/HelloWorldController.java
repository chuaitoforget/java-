package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
    public String index() {
        return "Hello---hkjhgjgj-----<b style='color:red;'>宋涛</b>";
    }
}