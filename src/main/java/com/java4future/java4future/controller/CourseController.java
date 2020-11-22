package com.java4future.java4future.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }
}
