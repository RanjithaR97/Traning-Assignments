package com.springMongo.SpringMongoCrud.model;


import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="book")
public class BookStore {
	
	@Id
	private int bookid;
	private String bookname;
	private String author;
	public BookStore() {
		super();
	}
	public BookStore(int bookid, String bookname, String author) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
