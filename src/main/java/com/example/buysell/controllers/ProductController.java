package com.example.buysell.controllers;

import ch.qos.logback.core.model.Model;
import com.example.buysell.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
@RequiredArgsConstructor

public class ProductController {


    private final ProductService productService;


    @GetMapping("/")
    public String products(Model model){
//        model.("products", productService.listProducts());
        return "products";
    }
}
