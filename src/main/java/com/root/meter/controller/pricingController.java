package com.root.meter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pricingController {
    @GetMapping("/pricing")
    public String get(){
        return "pricing";
    }
}
