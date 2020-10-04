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

	public static void lastName(String lastName) {
		String regex = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (lastName.matches(regex))
			System.out.println("Last Name is Valid");
		else
			System.out.println("Last Name is Invalid");
	}

	public static void email(String emailId) {
		String regex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
		if (emailId.matches(regex))
			System.out.println("EmailId is Valid");
		else
			System.out.println("EmailId is Invalid");
	}

	public static void mobileNumber(String number) {
		String regex = "^[0-9]{2}\\s[0-9]{10}$";
		if (number.matches(regex))
			System.out.println("Mobile Number is Valid");
		else
			System.out.println("Mobile Number is Invalid");
	}

	public static void setPassword(String password) {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
		if (password.matches(regex))
			System.out.println("Mobile Number is Valid");
		else
			System.out.println("Mobile Number is Invalid");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String fName = sc.next();
		firstName(fName);
		System.out.println("Enter the Last Name");
		String lName = sc.next();
		lastName(lName);
		System.out.println("Enter the EmailId");
		sc.nextLine();
		String emailId = sc.nextLine();
		email(emailId);
		System.out.println("Enter the mobile number");
		String number = sc.nextLine();
		mobileNumber(number);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		setPassword(password);
		sc.close();
	}

}
