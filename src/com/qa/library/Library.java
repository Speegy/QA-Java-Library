package com.qa.library;

import java.util.*;

import com.qa.library.contents.Items;

public class Library {

	private static List<Items> itemsList = new ArrayList<>();
	private static List<Items> personList = new ArrayList<>();
	
	public Library() {
	}

	// Example of Overload
//	public void add() {
//		System.out.println("No Item passed into add method parameter");
//	}
	
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
