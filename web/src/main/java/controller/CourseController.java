package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController  {
    @GetMapping("/")
    public String home() {
        System.out.println("Coś się stało!");
        return "home";
    }

}
