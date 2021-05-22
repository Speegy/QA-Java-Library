package com.qa.library;

import java.util.Scanner;

import com.qa.library.contents.Book;
import com.qa.library.contents.Camera;
import com.qa.library.contents.Maps;

public class Runner {

	public static void main(String[] args) {
		boolean bool = true;
		while(bool) {
			
			Camera c = new Camera("SD", 100);
			Book b = new Book("How to kill Hope", false, "Adventure", "Me");
			Maps m = new Maps("Map", true, "UK", "Treasure");
			Library l = new Library();
			l.addItem(c);
			l.addItem(b);
			l.addItem(m);
			m.setName("New Map");
			
//			System.out.println(l.checkinItem(m));
//			System.out.println(l.checkinItem(m));
			System.out.println(l.checkoutItem(m));
			System.out.println(l.checkoutItem(m));
//			l.updateItem(m);
//			System.out.println(l.getItems());
			
//			System.out.println("type 'e' to escape");
//			Scanner scan = new Scanner(System.in);
//			String escape = scan.nextLine();
//			if(escape.equals("e")) 
				bool = false;
		}
//		System.out.println("Application has ended");
	}

}
