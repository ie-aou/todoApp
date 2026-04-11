package com.example.todo_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    @PostMapping("/create")

}

