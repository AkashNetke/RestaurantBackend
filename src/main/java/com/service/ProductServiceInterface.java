package com.service;

import java.util.List;

import com.model.Product;

public interface ProductServiceInterface {
	
	public Product saveProduct(Product product);
	public List<Product> getAllProducts(Product product);
	public Product getProductById(int id);
	public void deleteProduct(int id);
	public Product updateProduct(Product product);
	
	

}
