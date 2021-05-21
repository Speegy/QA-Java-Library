package com.qa.library.contents;

public abstract class Items {

	private static int count = 0;
	private int id;
	private String name;
	private boolean checkedOut;
	public Items(int id, String name, boolean checkedOut) {
		super();
		this.id = ++count;
		this.name = name;
		this.checkedOut = checkedOut;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCheckedOut() {
		return checkedOut;
	}
	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", checkedOut=" + checkedOut + "]";
	}	
	
	
}
