import java.util.List;

import com.my.dto.Product;
import com.my.repository.ProductListRepository;

public class ProductManager {

	public static void main(String[] args) {
		ProductListRepository repository;
		repository = new ProductListRepository();
		repository.insert(new Product("D0001", "상품1", 1000));
		repository.insert(new Product("D0002", "상품2", 1000));
		repository.insert(new Product("D0003", "상품3", 1000));
		repository.insert(new Product("D0002", "상품4", 4000));//이미 존재하는 상품입니다
		
		List<Product> list = repository.selectAll();
		for(int i=0; i<list.size(); i++) {
			Product p = list.get(i);
			
			System.out.println(p); //p.toString()자동호출됨
			//상품번호는 D0001, 상품명은 상품1, 가격은 1000
			//상품번호는 D0002, 상품명은 상품2, 가격은 1000
			//상품번호는 D0003, 상품명은 상품3, 가격은 1000			
		}
	}

}
