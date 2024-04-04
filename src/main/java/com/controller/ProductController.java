package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.service.ProductServiceInterface;

@RestController
public class ProductController {

	@Autowired
	ProductServiceInterface productServ;
	
	@PostMapping("/saveProducts")
	public Product saveProduct(@RequestBody Product product) {
		return productServ.saveProduct(product);
	}
	
	@GetMapping("getAllProduct")
	public List<Product> getAllProducts(@RequestBody Product product) {
		return productServ.getAllProducts(product);
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id) {
		return productServ.getProductById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		productServ.deleteProduct(id);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productServ.updateProduct(product);
	}
	
}
