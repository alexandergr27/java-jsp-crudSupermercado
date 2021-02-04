package com.agrmarket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.agrmarket.connection.Connect;
import com.agrmarket.model.Product;
import com.mysql.cj.protocol.Resultset;

public class ProductDao {
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	private boolean operationStatus;
	
	private Connection connectDB() throws SQLException {
		return Connect.getConnection();
	}
	
	public boolean save(Product product) throws SQLException {
		String sql = null;
		operationStatus = false;
		connection = connectDB();
		
		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO product(code, description, brand, presentation, price, location) values(?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, product.getCode());
			preparedStatement.setString(2, product.getDescription());
			preparedStatement.setString(3, product.getBrand());
			preparedStatement.setString(4, product.getPresentation());
			preparedStatement.setInt(5, product.getPrice());
			preparedStatement.setInt(6, product.getLocation());
			
			operationStatus = preparedStatement.executeUpdate() > 0;
			
			connection.commit();
			preparedStatement.close();
			connection.close();
		} catch(SQLException e) {
			connection.rollback();
		}
		
		return operationStatus;
	}
	
	public boolean edit(Product product, int code) throws SQLException {
		String sql = null;
		operationStatus = false;
		connection = connectDB();
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE product SET code=?, description=?, brand=?, presentation=?, price=?, location=? WHERE code="+code;
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, product.getCode());
			preparedStatement.setString(2, product.getDescription());
			preparedStatement.setString(3, product.getBrand());
			preparedStatement.setString(4, product.getPresentation());
			preparedStatement.setInt(5, product.getPrice());
			preparedStatement.setInt(6, product.getLocation());
			
			operationStatus = preparedStatement.executeUpdate() > 0;
			
			connection.commit();
			preparedStatement.close();
			connection.close();
		} catch(SQLException e) {
			connection.rollback();
		}
		return operationStatus;
	}
	
	public boolean delete(int code) throws SQLException {
		String sql = null;
		operationStatus = false;
		connection = connectDB();
		try {
			connection.setAutoCommit(false);
			sql = "DELETE FROM product WHERE code=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, code);
			
			operationStatus = preparedStatement.executeUpdate() > 0;
			connection.commit();
			preparedStatement.close();
			connection.close();
		}catch(SQLException e) {
			connection.rollback();
		}
		return operationStatus;
	}
	
	public List<Product> getAllProducts() throws SQLException {
		ResultSet resultset = null;
		List<Product> productList = new ArrayList<Product>();
		String sql = null;
		//operationStatus = false;
		connection = connectDB();
		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM product";
			Statement smt = connection.createStatement();
			resultset = smt.executeQuery(sql);
			while(resultset.next()) {
				Product product = new Product();
				product.setCode(resultset.getInt(1));
				product.setDescription(resultset.getString(2));
				product.setBrand(resultset.getString(3));
				product.setPresentation(resultset.getString(4));
				product.setPrice(resultset.getInt(5));
				product.setLocation(resultset.getInt(6));
				
				productList.add(product);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
	}
	
	public Product getOneProduct(int code) throws SQLException {
		ResultSet resultset = null;
		Product product = new Product();
		String sql = null;
		connection = connectDB();
		try {
			sql = "SELECT * FROM product WHERE code=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, code);
			resultset = preparedStatement.executeQuery();
			if(resultset.next()) {
				product.setCode(resultset.getInt(1));
				product.setDescription(resultset.getString(2));
				product.setBrand(resultset.getString(3));
				product.setPresentation(resultset.getString(4));
				product.setPrice(resultset.getInt(5));
				product.setLocation(resultset.getInt(6));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return product;
	}
	
	

}
