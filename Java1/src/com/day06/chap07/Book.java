package com.day06.chap07;

//p207
public class Book {
	private String bookName;
	private String author;
		
	public Book(String bookName) {
		this.bookName=bookName;
	}
	
	public String getTitle() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	//setter
	
	public void setTitle(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showInfo() {
		System.out.println(bookName +
				  " : " + author);
	}

}





