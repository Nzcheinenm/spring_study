package ru.t1.spting_study.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.t1.spting_study.demo.services.ProductsService;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }



}
