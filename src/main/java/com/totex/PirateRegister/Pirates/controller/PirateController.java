package com.totex.PirateRegister.Pirates.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PirateController {

    @GetMapping("/test")
    public String welcome() {
        return "Test message";
    }
}
