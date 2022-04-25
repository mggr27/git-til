
public class Employee {
	String no; //사번
	String name; //이름
	int salary; //급여
	Employee(){
		System.out.println("생성자가 호출됨");
	} //생성자
	Employee(String no, String name){
//		this.no = no;
//		this.name = name;
//		this.salary = 1000;
//		System.out.println("this생성자호출은 생성자의 처음위치에서만 가능"); //생성자내부의 첫줄에서만 사용가능
		this(no, name, 1000); //this생성자호출 현재객체의 다른생성자를 호출하라,  생성자에서만 사용가능
	}
	Employee(String no, String name, int salary){ //생성자오버로드
		this.no = no;
		this.name = name;
		this.salary = salary;
	}
	void Employee() {
		//this 사용불가
	} //일반메서드
}
