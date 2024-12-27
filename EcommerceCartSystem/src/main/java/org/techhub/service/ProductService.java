package org.techhub.service;

import java.util.*;

import org.techhub.model.ProductModel;

public interface ProductService {
	public boolean addNewProduct(ProductModel prod);
	public Optional<List<ProductModel>> getAllProducts();
	public ProductModel getProductByName(String prodName);
}
