package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductServiceInterface{

	@Autowired
	ProductRepository productRepo;
	
	
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProducts(Product product) {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteProduct(int id) {
		productRepo.deleteById(id);		
	}

	@Override
	public Product updateProduct(Product product) {
		
		Product existingProduct = productRepo.findById(product.getId()).orElse(null);
			existingProduct.setName(product.getName());
			existingProduct.setPrice(product.getPrice());
		
		return productRepo.save(existingProduct);
	}

}
