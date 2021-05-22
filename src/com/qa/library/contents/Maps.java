package com.qa.library.contents;

public class Maps extends Items{

	private String location;
	private String type; // Ex: Road map, World Map, State Map, City Map, Treasure Map

	public Maps(String name, boolean checkedOut, String location, String type) {
		super(name, checkedOut);
		this.location = location;
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Maps [location=" + location + ", type=" + type + ", getName()=" + getName() + ", isCheckedOut()="
				+ isCheckedOut() + "]";
	}


}
