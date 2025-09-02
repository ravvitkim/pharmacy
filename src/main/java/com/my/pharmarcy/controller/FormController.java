package com.my.pharmarcy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
    @GetMapping
    public String mainForm() {
        return "main";
    }

    @GetMapping
    public String outputForm() {
        return "output";
    }
}
