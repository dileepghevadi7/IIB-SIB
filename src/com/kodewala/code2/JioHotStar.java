package com.kodewala.code2;

class User{
	
	public static int totalLiveUsers = 0;
	
	private String mobile;
	
	public User(String mobile) {
	this.mobile = mobile;
	{
		
	}
	totalLiveUsers = totalLiveUsers + 1;
    }
  }

public class JioHotStar {
 	
	public static void main(String[] args) {
		
		User u1 = new User("1234567896");
		User u2 = new User("1232345296");
	    User u3 = new User("9876543896");
	    User u4 = new User("12340087696");
	    User u5 = new User("12300009876");
	    User u6 = new User("187654322345");
	    
	    System.out.println("total live Viewers are:" + User.totalLiveUsers);
	}

}
