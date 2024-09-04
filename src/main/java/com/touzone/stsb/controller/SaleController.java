package com.touzone.stsb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaleController {

    @GetMapping("/admin/dash")
    public String dash() {
        return "admin/dash";
    }
}
