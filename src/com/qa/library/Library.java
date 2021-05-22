package com.qa.library;

import java.util.*;

import com.qa.library.contents.Items;
import com.qa.library.contents.Maps;

public class Library implements LibraryMethods{

	private static List<Items> itemsList = new ArrayList<>();
	private static List<Items> personList = new ArrayList<>();
	
	public Library() {
	}

	// Example of Overload
//	public void add() {
//		System.out.println("No Item passed into add method parameter");
//	}
	
	public List<Items> getItems() {
		return itemsList;
	}

	@Override
	public String toString() {
		return "Library [getItems()=" + getItems() + "]";
	}

	public String checkoutItem(Items item) {
		String str = "";
		if(item.isCheckedOut() == true) {
			str = item.getName() + " is already checked out";
		} else { 
			str = item.getName() + " has been checked out";
			item.setCheckedOut(true);
		}
		return str;
	}

	public String checkinItem(Items item) {
		String str = "";
		if(item.isCheckedOut() == false) {
			str = item.getName() + " is already checked in";
		} else { 
			str = item.getName() + " has been checked in";
			item.setCheckedOut(false);
		}
		return str;
	}

	@Override
	public String addItem(Items item) {
		itemsList.add(item);
		checkinItem(item);
		return item + " has been added to the Library";
	}

	@Override
	public String deleteItem(Items item) {
		for(int i = 0; i < itemsList.size(); i++) {
			if(itemsList.get(i).equals(item)) {
				itemsList.remove(item);
				break;
			}
		}
		return item.getName() + " has been deleted";
	}
	
}
