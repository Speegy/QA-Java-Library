package com.qa.library.people;

public class Person {

	private static int count = 0;
	private int id;
	private String firstName;
	private String lastName;
	private boolean isRegistered;
	
	public Person(int id, String firstName, String lastName, boolean isRegistered) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isRegistered = isRegistered;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", isRegistered="
				+ isRegistered + "]";
	}
	
}
