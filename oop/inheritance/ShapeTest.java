package inheritance;

abstract class Shape{
	protected double area;
	double getArea() {
		return area;
	}	
	void print() {
		System.out.println("이것은 도형입니다");
	}
	void calcArea() {}
}
class Circle extends Shape{
	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	void print() {
		super.print();
		System.out.println("반지름이 "+ radius + "인 원입니다");
	}
	void calcArea() {
		area = this.radius * this.radius * Math.PI;
	}
	
}
class Rectangle extends Shape{
	private int width;
	private int height;

	Rectangle(int size){
		this.width = size;
		this.height = size;
	}
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	void print() {
		super.print();
		System.out.println("가로" + width + ",세로" + height + "인 사각형입니다" );
	}
	void calcArea() {
		area = width * height; //
	}
	
}
class Triangle extends Shape{
	int width; //밑변
	int height; //높이
	
	Triangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	void calcArea() {
		area = width * height/2.0; //
	}
}
public class ShapeTest {
	
//	public static void printArea(Circle c) {
//		System.out.println(c.getArea()); //면적값 반환하여 출력
//	}
//	public static void printArea(Rectangle r) {
//		System.out.println(r.getArea()); //면적값 반환하여 출력
//	}
	
	public static void printArea(Shape s) { //업캐스팅 Shape s = c; 변수대입처럼
		System.out.println(s.getArea());
		s.print(); //다형성효과
	}//shape클래스에 print메서드있는지확인 없으면컴파일에러
	
	public static void main(String[] args) {
		
		Shape[] arr = new Shape[3];
		arr[0] = new Circle(5);
		arr[1] = new Rectangle(3,4);
		arr[2] = new Rectangle(5);
		arr[3] = new Triangle(5,3);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].calcArea();
			printArea(arr[i]);
		}
		
//		Circle c = new Circle(5); //반지름이 5인 원객체생성
//		c.print(); //반지름이 5인 원입니다 출력
//		c.calcArea(); //원면적계산
//		printArea(c); 
//		
//		Rectangle r = new Rectangle(3,4); //가로3, 세로4인 사각형객체생성
//		r.print(); //가로3, 세로4인 사각형입니다 출력
//		r.calcArea(); //사각형면적계산
//		printArea(r);
//		
//		Rectangle r1 = new Rectangle(5); //가로5, 세로5인 사각형객체생성
//		r1.print(); //가로5, 세로5인 사각형입니다 출력
//		r1.calcArea();
//		printArea(r1);
//		
		
	}
}
