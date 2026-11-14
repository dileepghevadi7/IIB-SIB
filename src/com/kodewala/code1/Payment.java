package com.kodewala.code1;

public class Payment {
	{
		System.out.println(" inside IIB ");
	}
	
	public Payment() {
		System.out.println("inside Payment() contructor");
	}
    public static void main(String[] args) {
		System.out.println("Payment.main()");
		Payment  payment = new Payment();
	 }
    static {
    	System.out.println("inside sib");
    }
}
