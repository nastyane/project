package com.example.buysell;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllers_ProductController {
//    @GetMapping("/")
    public String products () {
        return "products";
    }
}
