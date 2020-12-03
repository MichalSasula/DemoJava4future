package com.java4future.java4future.controller;

import com.java4future.java4future.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class CourseController  {
    @GetMapping("/")
    public String home() {
        System.out.println("Coś się stało!");
        return "home";
    }

}
