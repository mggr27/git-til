/**
 * --상품--
 * 상품번호 F0001  G0001  D0001
 * 상품명  스콘     머그1   아메리카노
 * 상품가격 1000   2000   1000
 * 상품상세정보 "~~"
 * 상품제조일자 22/04/20
 * 		220420
 * 		042022
 * 		2022/04/02
 * 		Date
 * @author writer
 *
 */
import java.util.Date;
class Product{
	String prodNo;
	String prodName;
	int prodPrice;
	String prodInfo;
	Date prodMfd;
	Product(String prodNo, String prodName, int prodPrice){
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	Product(String prodNo, String prodName, int prodPrice, Date prodMfd){
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodMfd = prodMfd;
	}
}
/**
 * 상품을 저장소에 추가, 수정, 조회, 삭제
 * @author writer
 *
 */
class ProductRepository{
	Product[] products; //저장소 개수5
	int cnt; //저장소에 저장(등록)된 상품수0
//	ProductRepository(String[] md){} //my
	
	/**
	 * 저장소에 상품을 추가한다 
	 * @param product 상품
	 */
	ProductRepository(){
		this.products=new Product[5];
	}
	ProductRepository(int i){
		this.products=new Product[i];
	}
	void insert(Product product) {
		this.products[cnt]=product;
		this.cnt++;
	}
}

public class ProductManager {

	public static void main(String[] args) {
		ProductRepository repository;
		repository = new ProductRepository(); //최대5개까지 저장할 수 있는 저장소를 생성한다
//		repository = new ProductRepository(10); //최대10개까지 저장할 수 있는 저장소를 생성한다
		
		Product p1 = new Product("D0001","아메리카노",1000,new Date());
		repository.insert(p1);
		repository.insert(new Product("F0001","스콘",1500,new Date()));
	}
	
	/*
	ProductRepository(){
		this.products=new Product[5];
	}
	ProductRepository(int i){
		this.products=new Product[i];
	}
	Product(String prodNo,String prodName,int prodPrice){
		this.prodNo=prodNo;
		this.prodName=prodName;
		this.prodPrice=prodPrice;
	}
	void insert(Product product) {
		this.products[cnt]=product;
		this.cnt++;
	}
	Product(String prodNo,String prodName,int prodPrice,Date prodMfd){
		this(prodNo,prodName,prodPrice);
		this.prodMfd=prodMfd;
	}
	*/
	
}
