class Rectangle{
	int width;
	int height;
	int area;
	/**
	 * 사각형의 기로 길이와 세로길이를 매개변수로 받습니다
	 * @param width
	 * @param height
	 */
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	Rectangle(int size){
		this(size,size);
//		this.width = size;
//		this.height = size;
	}
	/**
	 * 사각형의 가로길이와 세로길이를 출력해줍니다.
	 */
	public void print(){
		System.out.println("가로길이는 "+this.width+"세로길이는" + this.height+"인 사각형입니다");
	}
	/**
	 * 가로와 높이를 곱하여 해당 객체의 면적(area)을 구하는 메소드입니다.
	 */
	public void calcArea() {
		this.area = this.width * this.height;
	}
	/**
	 * 객체의 면적을 반환하는 메소드입니다.
	 * @return
	 */
	public int getArea() {
		return this.area;
	}
}

public class ShapeTest {

        public static void main(String[] args) {
		Rectangle r = new Rectangle(3,4); //가로길이3, 세로길이4인 사각형객체를 만든다
		r.calcArea(); //사각형의 면적을 계산한다
		r.print(); //"가로길이는 3, 세로길이는 4인 사각형입니다"가 출력된다
		int area = r.getArea();
		System.out.println("면적은"+area+"입니다");
		
		Rectangle r1 = new Rectangle(5); //가로길이5, 세로길이5인 사각형객체를 만든다
		r1.print();
		
	}
}
