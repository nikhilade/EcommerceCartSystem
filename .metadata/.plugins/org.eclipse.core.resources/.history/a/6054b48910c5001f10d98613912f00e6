package org.techhub.repository;

import java.sql.Timestamp;
import java.util.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.techhub.model.ProductModel;

public class ProductRepositoryImpl extends DBSTATE implements ProductRepository {
	
	private static Logger logger = Logger.getLogger(ProductRepositoryImpl.class);

	static {
		PropertyConfigurator.configure(
				"C:\\Users\\abcd\\Desktop\\Project\\EcommerceCartSystem\\src\\main\\resources\\application.properties");
	}
	
	List<ProductModel> list = new ArrayList<ProductModel>();

	public boolean addNewProduct(ProductModel prod) {
		try {
			stmt = conn.prepareStatement("insert into products values('0',?,?,?,?,?)");
			stmt.setString(1, prod.getName());
			stmt.setString(2, prod.getDescription());
			stmt.setDouble(3, prod.getPrice());
			stmt.setInt(4, prod.getStockQuantity());
			stmt.setTimestamp(5, Timestamp.valueOf(prod.getCreatedAt()));
			int value = stmt.executeUpdate();
			return value > 0 ? true : false;
		} catch (Exception ex) {
			logger.error("Error adding new product: " + ex.getMessage(), ex);
		}
		return false;
	}
	
	public Optional<List<ProductModel>> getAllProducts() {
		try {
			stmt = conn.prepareStatement("select * from products");
			rs = stmt.executeQuery();

			while (rs.next()) {
				ProductModel prod = new ProductModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4),
						rs.getInt(5), rs.getTimestamp(6).toLocalDateTime());
				list.add(prod);
			}
			return list.isEmpty() ? Optional.empty() : Optional.of(list);
		} catch (Exception e) {
			logger.error("Error retrieving all products: " + e.getMessage(), e);
			return null;
		}
		
	}

	public ProductModel getProductByName(String prodName) {
		try {
			stmt = conn.prepareStatement("select * from products where name = ?");
			stmt.setString(1, prodName);
			rs = stmt.executeQuery();
			if(rs.next()) {
				return new ProductModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4),
						rs.getInt(5), rs.getTimestamp(6).toLocalDateTime());
			}else {
				return null;
			}
		}catch(Exception e){
			logger.error("Error getting product by name: " + e.getMessage(), e);
			return null;
		}
		
	}

}
