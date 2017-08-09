package com.example;

import com.example.ProductForm;

import java.util.List;

import com.example.Product;


public interface ProductService {
	
	 List<Product> listAll();

	    Product getById(String id);

	    Product saveOrUpdate(Product product);

	    void delete(String id);

	    Product saveOrUpdateProductForm(ProductForm productForm);

}
