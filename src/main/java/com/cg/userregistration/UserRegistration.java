package com.cg.userregistration;

import java.util.*;

public class UserRegistration {
	
	public static void lastName(String lastName) {
		String regex = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (lastName.matches(regex))
			System.out.println("Last Name is Valid");
		else
			System.out.println("Last Name is Invalid");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last Name");
		String lName = sc.next();
		lastName(lName);
		sc.close();
	}

}
