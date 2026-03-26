package com.example.todo_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
    
    @GetMapping("test")
    public String getMethodName() {
        return "test";
    }

}

