package org.techhub.repository;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.techhub.model.ProductModel;

public class CartRepositoryImpl extends DBSTATE implements CartRepository{
	private static Logger logger = Logger.getLogger(CartRepositoryImpl.class);
	static {
		PropertyConfigurator.configure(
				"C:\\Users\\abcd\\Desktop\\Project\\EcommerceCartSystem\\src\\main\\resources\\application.properties");
	}
	
	@Override
	public boolean addProductToCart(int userId, ProductModel product, int quantity) {
        String query = "insert into cart (user_id, product_id, quantity, added_at) values ('0',?, ?, ?, ?)";
        try {
        	stmt = conn.prepareStatement(query);
            stmt.setInt(1, userId);
            stmt.setInt(2, product.getProductId());
            stmt.setInt(3, quantity);
            stmt.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
            int result = stmt.executeUpdate();

            if (result > 0) {
                logger.info("Product added to cart: " + product.getName());
                return true;
            } else {
                logger.error("Failed to add product to cart.");
            }
        } catch (SQLException e) {
            logger.error("Error adding product to cart: " + e.getMessage(), e);
        }
        return false;
    }

}
