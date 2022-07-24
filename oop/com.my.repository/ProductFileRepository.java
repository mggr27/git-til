package com.my.repository;

import java.util.List;

import com.my.dto.Product;
import com.my.exception.AddException;
import com.my.exception.FindException;

public class ProductFileRepository implements ProductRepository{
	
	private String fileName;
	
	public void insert(Product product) throws AddException{
	}
	
	public List<Product> selectAll() throws FindException{
		return null;
	}
	
	public Product selectByProdNo(String prodNo) throws FindException{
		return null;
	}
	
	public List<Product> selectByProdNoOrProdName(String word) throws FindException{
		return null;
	}
}
