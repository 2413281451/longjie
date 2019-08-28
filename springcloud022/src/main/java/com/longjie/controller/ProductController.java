package com.longjie.controller;

import com.longjie.pojo.Product;
import com.longjie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("products")
    public Object product(){
        List<Product> ps = productService.listProduct();
        return ps;
    }
}
