package com.my.dto; //DataTransferObject 자료전달객체

import java.util.Date;

public class Product {
	private String prodNo;
	private String prodName;
	private int prodPrice;
	private String prodInfo;
	private Date prodMfd;

	public Product(String prodNo, String prodName, int prodPrice) {
		this(prodNo, prodName, prodPrice, null, null);
//			this.prodNo = prodNo;
//			this.prodName = prodName;
//			this.prodPrice = prodPrice;
	}

	public Product(String prodNo, String prodName, int prodPrice, Date prodMfd) {
		this(prodNo, prodName, prodPrice, null, prodMfd);
//			this.prodNo = prodNo;
//			this.prodName = prodName;
//			this.prodPrice = prodPrice;
//			this.prodMfd = prodMfd;
	}

	public Product(String prodNo, String prodName, int prodPrice, String prodInfo, Date prodMfd) {
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodInfo = prodInfo;
		this.prodMfd = prodMfd;
	}

	public void print() {
		System.out.println(
				"상품번호: " + prodNo + "상품명: " + prodName + "가격: " + prodPrice + "상세정보: " + prodInfo + "제조일자:" + prodMfd);
	}
}
