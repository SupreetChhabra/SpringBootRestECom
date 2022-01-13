package com.chhabra.springboot.ecommerce.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.chhabra.springboot.ecommerce.entity.Product;
import com.chhabra.springboot.ecommerce.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(method = RequestMethod.GET, path="/hello-world")
	public String getAllProducts() {
		return "Hello World";
	}
	
	@PostMapping("/product")
	public ResponseEntity<Object> addProduct(@RequestBody Product product) {
		System.out.println("ferfef "+product);
		Product savedProduct= productRepository.save(product);
		
		return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	}
}
