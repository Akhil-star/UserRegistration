package com.cg.userregistration;

import java.util.*;

public class UserRegistration {
	public static void firstName(String firstName) {
		String regex = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (firstName.matches(regex))
			System.out.println("First Name is Valid");
		else
			System.out.println("First Name is Invalid");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String fName = sc.next();
		firstName(fName);
		sc.close();
	}

}
