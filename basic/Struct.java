
public class Struct {

	public static void main(String[] args) {
		
		//배열: 동일자료의 데이터묶음, 크기고정, 길이얻기length
		int[] arr = new int[10];
		arr[0] =5;
		arr[1] =8;
//		arr[2] ="HELLO"; //동일 자료형만
//		arr[10] = 999; //존재하지 않은 인덱스
		
		//맵: 키와 값을 저장, 크기자동변경, 길이얻기 size()
		java.util.Map map;
		map = new java.util.HashMap();
		map.put("name", "몰리"); //크기1
		map.put("addr", "송파"); //크기2
		map.put("sal", 3000); //크기3
		System.out.println(map.size()); //3
		System.out.println(map.get("name")); //몰리
		System.out.println(map.get("sal")); //3000
	
	}
}
