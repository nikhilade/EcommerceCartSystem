package org.techhub.service;

import java.util.*;

import org.techhub.model.ProductModel;
import org.techhub.repository.AuthRepository;
import org.techhub.repository.AuthRepositoryImpl;
import org.techhub.repository.ProductRepository;
import org.techhub.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService{
	ProductRepository prepo = new ProductRepositoryImpl();
	
	public boolean addNewProduct(ProductModel prod) {
		return prepo.addNewProduct(prod);
	}
	public Optional<List<ProductModel>> getAllProducts() {
		return prepo.getAllProducts();
	}
	public ProductModel getProductByName(String prodName) {
		return prepo.getProductByName(prodName);
	}
}