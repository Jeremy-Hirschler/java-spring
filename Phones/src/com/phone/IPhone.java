package com.phone;

public class IPhone extends Phones implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage,
			String carrier, String ringtone) {
		super(versionNumber, batteryPercentage, carrier, ringtone);
	}
	
	@Override
	public String ring() {
		return "Beep beppers";
	}
	
	@Override
	public String unlock() {
		return "Swipe-ipe";
	}
	
	@Override
	public void displayInfo() {
		
	}
}
