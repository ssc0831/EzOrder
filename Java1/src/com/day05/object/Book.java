package com.day05.object;

public class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title) {
		this.title = title;
	}


	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	


}













