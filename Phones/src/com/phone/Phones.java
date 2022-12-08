package com.phone;

public abstract class Phones {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringtone;
	public Phones(String versionNumber, int batteryPercentage,
			String carrier, String ringtone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringtone = ringtone;
	}
	//abstract method only implemented by subclasses
	public abstract void displayInfo();
	//implement getters and setters
	
}
