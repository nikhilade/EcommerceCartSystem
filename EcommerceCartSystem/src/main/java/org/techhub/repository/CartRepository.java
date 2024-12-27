package org.techhub.repository;

import java.util.Scanner;

import org.techhub.model.CartModel;
import org.techhub.model.ProductModel;
import org.techhub.model.UserModel;

public interface CartRepository {
	public boolean addProductToCart(int userId, ProductModel product, int quantity);
	public boolean updateProductStock(int productId, int newStockQuantity);
	public ProductModel getProductById(int productId);
	public CartModel getCartItems(UserModel userId);
}
