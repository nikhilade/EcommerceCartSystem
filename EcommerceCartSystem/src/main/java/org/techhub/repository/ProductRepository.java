package org.techhub.repository;

import org.techhub.model.ProductModel;
import java.util.*;

public interface ProductRepository {
	public boolean addNewProduct(ProductModel prod);
	public Optional<List<ProductModel>> getAllProducts();
	public ProductModel getProductByName(String prodName);
}