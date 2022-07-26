package com.my.repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.my.dto.Product;
import com.my.exception.AddException;
import com.my.exception.FindException;

public class ProductFileRepository implements ProductRepository{
	
	private String fileName = "products.txt";
	private FileReader fr;
	
//	private FileReader fr;
//	private Scanner sc;
	public ProductFileRepository() {
//		fr = new FileReader(fileName);
//		FileReader fr = new FileReader(fileName);
//		sc = new Scanner(fr);
		
	}
	
	public void insert(Product product) throws AddException{
		
	}
	
	public List<Product> selectAll() throws FindException{
		
//		fr.read(); //한문자씩 읽기
//		FileReader fr = new FileReader(fileName);
//		Scanner sc = new Scanner(fr);
//		sc.nextLine();
		
		Scanner sc = null;
		try {
			sc = new Scanner(new FileInputStream(fileName));
			List<Product> all = new ArrayList<>();
			while(sc.hasNextLine()) { //while((sc.hasNextLine()) == true){
				String line = sc.nextLine();
				String[] arr = line.split(":", 3);
				String prodNo = arr[0];
				String prodName = arr[1];
				int prodPrice = Integer.parseInt(arr[2]);
				Product p = new Product(prodNo, prodName, prodPrice);
				all.add(p);
			}
			if(all.size() == 0) {
				throw new FindException("상품이 없습니다");
			}
			return all;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FindException("상품이 없습니다");
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	public Product selectByProdNo(String prodNo) throws FindException{
//		FileReader fr = new FileReader(fileName);
//		Scanner sc = new Scanner(fr);
		return null;
	}
	
	public List<Product> selectByProdNoOrProdName(String word) throws FindException{
//		FileReader fr = new FileReader(fileName);
//		sc = new Scanner(fr);
		return null;
	}
}
