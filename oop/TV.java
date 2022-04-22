package oop;

public class TV {
	boolean power;
	int channel;
	int volume;
	public boolean isPower() {		
		return power; //현재사용중인 TV객체의 power값
	}
	public void setChannel(int ch) {
		channel = ch;		
	}
	public int getChannel() {
		return channel;		
	}
	public void volumeUp() {
		volume++;		
	}
	public int getVolume() {
		return volume;
	}
	

}
