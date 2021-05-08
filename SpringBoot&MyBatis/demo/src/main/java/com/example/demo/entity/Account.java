package com.example.demo.entity;

public class Account {
	private String userID;
	private String pass;
	private String mail;
	private String name;
	private int age;
	public Account() {};

	public String getUserID() {
		return userID;
	}
	public String getPass() {
		return pass;
	}
	public String getMail() {
		return mail;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
}
