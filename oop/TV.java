/**
 * TV객체가 될 클래스입니다
 * @author 오문정
 * @version 1.0
 *
 */

public class TV {
	boolean power;
	int channel;
	int volume;
	public boolean isPower() {		
		return this.power; //현재사용중인 TV객체의 power값
	}
	/**
	 * 채널을 설정한다
	 * @param channel 설정할 채널값
	 */
	public void setChannel(int channel) {
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

