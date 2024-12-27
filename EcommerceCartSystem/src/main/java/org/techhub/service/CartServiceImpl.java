package org.techhub.service;

import java.util.Scanner;

import org.techhub.model.CartModel;
import org.techhub.model.ProductModel;
import org.techhub.model.UserModel;
import org.techhub.repository.CartRepository;
import org.techhub.repository.CartRepositoryImpl;

public class CartServiceImpl implements CartService{
	CartRepository crepo = new CartRepositoryImpl();
	@Override
	public boolean addProductToCart(int userId, ProductModel product, int quantity) {
		return crepo.addProductToCart(userId, product, quantity);
	}
	@Override
	public boolean updateProductStock(int productId, int newStockQuantity) {
		return crepo.updateProductStock(productId, newStockQuantity);
	}
	@Override
	public ProductModel getProductById(int productId) {
		return crepo.getProductById(productId);
	}
	@Override
	public CartModel getCartItems(UserModel user) {
		return crepo.getCartItems(user);
	}

}
