package com.klu.mental_health_support_platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @GetMapping("/dashboard")
    public String studentDashboard() {
        return "student-dashboard";  // Student dashboard view
    }
}
