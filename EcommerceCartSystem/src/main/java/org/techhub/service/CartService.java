package org.techhub.service;

import java.util.Optional;
import java.util.Scanner;

import org.techhub.model.ProductModel;
import org.techhub.model.UserModel;

public interface CartService {
	public boolean addProductToCart(int userId, ProductModel product, int quantity);
	
}
