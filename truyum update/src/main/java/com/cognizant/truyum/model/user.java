package com.cognizant.truyum.model;

public class user {
	private int userId;

	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public user(int userId) {
		super();
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "user [userId=" + userId + "]";
	}


}
