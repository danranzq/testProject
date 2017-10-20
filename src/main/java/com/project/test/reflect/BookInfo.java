package com.project.test.reflect;

public class BookInfo {
	private String isbn;
	private String name;
	private String desc;
	public BookInfo(){
		
	}
	public BookInfo(String isbn,String name,String desc){
		this.isbn = "100000";
		this.name = "Effective Java";
		this.desc = "this is a java book;";
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getBookInfo(String info){
		return "this book info is:"+"isbn:"+this.isbn+",name:"+this.name+",desc:"+this.desc;
	}
}
