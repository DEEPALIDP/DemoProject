package com.encapsulation;

public class AithmeticException {
	public static void main(String[] args) {
		//int c;
		try {
			int  c = 4/0;
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("after exception rest of the code");
	}

}
