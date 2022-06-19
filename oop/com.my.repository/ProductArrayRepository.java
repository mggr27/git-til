package com.my.repository; //저장소

import com.my.dto.Product;
import com.my.exception.AddException;
/**
 * 배열저장소
 * @author writer
 *
 */
public class ProductArrayRepository{
	private Product[] products; //저장소 개수5
	private int cnt; //저장소에 저장(등록)된 상품수0
//	ProductRepository(String[] md){} //my
	
	public ProductArrayRepository(){  
		products=new Product[5];
	}
	public ProductArrayRepository(int size){
		products=new Product[size];
	}
	/**
	 * 저장소에 상품을 추가한다 
	 * @param product 상품
	 */
	public void insert(Product product) throws AddException{//ArrayIndexOutOfBoundsException {
		try {
			products[cnt]=product; //GOOD 안정성 cnt더하기전에 catch로 이동
			cnt++;
//			products[cnt++] = product; //BAD ++연산자가 =와 같이쓰이면위험 cnt에 더하고 catch로 이동
			System.out.println("상품종류개수: "+ cnt);
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("저장소가 꽉찼습니다. 현재 상품종류개수: "+cnt);
			throw new AddException("저장소가 꽉찼습니다. 현재 상품종류개수: "+cnt);
		}
	}
	/**
	 * 저장된 상품들을 반환한다
	 * @return
	 */
	public Product[] selectAll() {
		// return products;
		Product[] result = new Product[cnt];
		for (int i = 0; i < cnt; i++) {
			result[i] = products[i];
		}
		return result;
	}
}
