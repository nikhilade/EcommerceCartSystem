package org.techhub.service;

import java.util.Scanner;

import org.techhub.model.ProductModel;
import org.techhub.repository.CartRepository;
import org.techhub.repository.CartRepositoryImpl;

public class CartServiceImpl implements CartService{
	CartRepository crepo = new CartRepositoryImpl();
	@Override
	public boolean addProductToCart(int userId, ProductModel product, int quantity) {
		return crepo.addProductToCart(userId, product, quantity);
	}

}
