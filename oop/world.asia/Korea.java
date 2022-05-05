package world.asia;

public class Korea {
	public String language = "한국어";//언어
	private String capital; //수도
	int population; //인구
	
	public Korea() {
		capital = "서울";
	}
	public void setPopulation(int population) {
		if(population < 1) {
			System.out.println("인구는 1이상이어야합니다");
			return;
		}
		this.population = population;
	}
}
