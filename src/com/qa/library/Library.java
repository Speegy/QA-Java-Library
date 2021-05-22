package com.qa.library;

import java.util.*;

public class Library {

	private static List<Items> itemsList = new ArrayList<>(); 
	
	public Library() {
	}
	
	public void add(Items item) {
		itemsList.add(item);
	}
	
	public List<Items> getItems() {
		return itemsList;
	}

	@Override
	public String toString() {
		return "Library [getItems()=" + getItems() + "]";
	}
	
}
