/**
 * TV객체가 될 클래스입니다
 * @author writer
 * @version 1.0
 *
 */
public class TV {
	private boolean power; //멤버변수 
	private int channel; //member field
	private int volume; //인스턴스변수 heap 영역에 저장됨
	
	public void powerOn() {
		power = true;
	}
	public boolean isPower() {		
		return this.power; //현재사용중인 TV객체의 power값
	}
	
	/**
	 * 채널을 설정한다
	 * @param channel 설정할 채널값
	 */
	public void setChannel(int channel) {
		if(channel<0) {
			System.out.println("잘못된 채널입니다");
			return;
		}
		this.channel = channel;		
	}
	/**
	 * 채널값을 반환한다
	 * @return 채널값
	 */
	public int getChannel() {
		return channel;		
	}
	
	/**
	 * 음량을 1증가시킨다
	 */
	public void volumeUp() {
		volume++;		
	}
	/**
	 * 음량을 반환한다
	 * @return 음량값
	 */
	public int getVolume() {
		return volume;
		
	}
}
