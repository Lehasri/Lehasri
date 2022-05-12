package com.chainsys.classandmethods;

public class Book {
	private String bookTitle = "";
	private int yearOfPublished;
	private String Author;
	private int Rate;
	private int yearWhenCreated;
	private String Book;
	
	public Book(String Book)
	{
		this.setBook(Book);
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		 this.bookTitle = bookTitle;
	}
	public int getYearOfPublished() {
		return yearOfPublished;
	}
	public void setYearOfPublished(int yearOfPublished) {
		this.yearOfPublished = yearOfPublished;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getRate() {
		return Rate;
	}
	public void setRate(int rate) {
		Rate = rate;
	}
	public int getYearWhenCreated() {
		return yearWhenCreated;
	}
	public void setYearWhenCreated(int yearWhenCreated) {
		this.yearWhenCreated = yearWhenCreated;
	}
	public String getBook() {
		return Book;
	}
	public void setBook(String book) {
		Book = book;
	}

}
