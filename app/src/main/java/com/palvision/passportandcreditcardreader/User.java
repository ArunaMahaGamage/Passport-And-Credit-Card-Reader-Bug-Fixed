package com.palvision.passportandcreditcardreader;

import java.util.ArrayList;

public class User {

	//declare private data instead of public to ensure the privacy of data field of each class
	private String name;

	public User(String name) {
		this.name = name;
	}

	//retrieve user's name
	public String getName(){
		return name;
	}


	public static ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Passport Reader"));
		users.add(new User("Credit Card Reader"));
		return users;
	}
}
