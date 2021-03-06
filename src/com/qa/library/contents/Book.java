package com.qa.library.contents;

public class Book extends Items {

	private String genre;
	private String author;
	
	public Book(String genre,String author) {
		super();
		this.genre = genre;
		this.author = author;
	}
	
	public Book(String name, boolean checkedOut,String genre,String author) {
		super(name, checkedOut);
		this.genre = genre;
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [genre=" + genre + ", author=" + author + ", toString()=" + super.toString() + "]";
	}
	
}
