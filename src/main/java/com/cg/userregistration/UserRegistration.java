package com.cg.userregistration;

import java.util.*;

public class UserRegistration {
	
	public static void setPassword(String password) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
		if (password.matches(regex))
			System.out.println("Mobile Number is Valid");
		else
			System.out.println("Mobile Number is Invalid");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		setPassword(password);		
		sc.close();
	}

}
