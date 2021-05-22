package com.qa.library.contents;

import com.qa.library.LibraryMethods;

public abstract class Items implements LibraryMethods{

	private static int count = 0;
	private int id;
	private String name;
	private boolean checkedOut;
	
	public Items() {
		this("Unknown", false);
	}
	
	public Items(String name, boolean checkedOut) {
		this.name = name;
		this.checkedOut = checkedOut;
		this.id = ++count;
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

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", checkedOut=" + checkedOut + "]";
	}	
	
	
}
