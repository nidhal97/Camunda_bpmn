package com.example.demo_keycloac;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	@Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts() {
       return productService.getproducts();
    }
    
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) throws Exception {
    	request.logout();
    	return "/";
    }
}
