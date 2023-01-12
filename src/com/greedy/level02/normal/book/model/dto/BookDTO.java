package com.greedy.level02.normal.book.model.dto;

public class BookDTO {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	//기본생성자
	public BookDTO() {}
	
	//매개변수가 있는 생성자
	public BookDTO(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public BookDTO(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	//출력용 메소드
	public void printInformation() {
		System.out.println(title + ", " + publisher + ", " + author + ", " + price + ", " + discountRate);
	}
	
}
