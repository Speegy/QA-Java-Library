package com.qa.library.contents;

public class Camera extends Items{

	private String imageStorage;
	private int battery;

	public Camera(String imageStorage, int battery) {
		super();
		this.imageStorage=imageStorage;
		this.battery=battery;
	}
	
	public Camera(String name, boolean checkedOut, String imageStorage, int battery) {
		super(name, checkedOut);
		this.imageStorage=imageStorage;
		this.battery=battery;
	}

	public String getImageStorage() {
		return imageStorage;
	}

	public void setImageStorage(String imageStorage) {
		this.imageStorage = imageStorage;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String checkoutItem() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Camera [imageStorage=" + imageStorage + ", battery=" + battery + ", toString()=" + super.toString()
				+ "]";
	}
	
}
