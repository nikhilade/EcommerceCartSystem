package org.techhub.model;

import java.time.LocalDateTime;

public class CartModel {
	private int cartId;
	private int userId;
	private int productId;
	private int quantity;
	private LocalDateTime addedAt;

	public CartModel() {
	}

	public CartModel(int cartId, int userId, int productId, int quantity, LocalDateTime addedAt) {
		this.cartId = cartId;
		this.userId = userId;
		this.productId = productId;
		this.quantity = quantity;
		this.addedAt = addedAt;
	}

	// Getters and Setters
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getAddedAt() {
		return addedAt;
	}

	public void setAddedAt(LocalDateTime addedAt) {
		this.addedAt = addedAt;
	}

	@Override
	public String toString() {
		return "CartModel{" + "cartId=" + cartId + ", userId=" + userId + ", productId=" + productId + ", quantity="
				+ quantity + ", addedAt=" + addedAt + '}';
	}
}
