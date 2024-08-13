package com.example.ConsumerService;


public class Book {
	Integer bookId;
	String bookName;
	Integer bookCost;
	public Book() {
		super();
	}
	public Book(Integer bookId, String bookName, Integer bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookCost() {
		return bookCost;
	}
	public void setBookCost(Integer bookCost) {
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCost=" + bookCost + "]";
	}
	

}
