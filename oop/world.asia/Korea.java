package world.asia;

public class Korea {
	private String language = "한국어";//언어
	private String capital; //수도
	private int population; //인구
	
	public Korea() {
		capital = "서울"; //생성자통해서 초기화
	}
	public void setPopulation(int population) {
		if(population < 1) { //전달된 인자값이 1이상일때 매개변수에 자동대입
			System.out.println("인구는 1이상이어야합니다");
			return; // void로 선언된 메서드에서 return은 메서드를 끝낸다는뜻
		}
		this.population = population;
	}
}
