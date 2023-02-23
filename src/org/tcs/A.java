package org.tcs;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = s.next();
		System.out.println("Enter the mobile");
		String mobileNo = s.next();
		System.out.println("Enter the Date of Birth:");
		int dob= s.nextInt();
		System.out.println("The Name is:"+name);
		System.out.println("The mobile Number" +mobileNo);
		System.out.println("The Date of Birth"+dob);
	}
}
