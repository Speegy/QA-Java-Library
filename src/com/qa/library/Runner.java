package com.qa.library;

import java.util.Scanner;

import com.qa.library.contents.Camera;

public class Runner {

	public static void main(String[] args) {
		boolean bool = true;
		while(bool) {
			
			Camera c = new Camera("Camera", false, "SD", 100);
			Library l = new Library();
			l.add(c);
			System.out.println(l.getItems());
			
//			System.out.println("type 'e' to escape");
//			Scanner scan = new Scanner(System.in);
//			String escape = scan.nextLine();
//			if(escape.equals("e")) 
				bool = false;
		}
		System.out.println("Application has ended");
	}

}
