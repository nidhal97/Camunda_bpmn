package com.example.demo_keycloac;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public static List<Product> produit= new ArrayList<Product>() ;
	
	
	
	static {
		produit.add(new Product("id1","XXABC",120.00));
		produit.add(new Product("id3","XXRFR",110.00));
		produit.add(new Product("id4","XXTER",140.00));
	}
	
					
	public List<Product> getproducts(){
        return produit ;
               
        
}
}
