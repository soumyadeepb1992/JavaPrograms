package com.java.programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String initial, rev="";
		System.out.println("Enter Name:");
		Scanner sc = new Scanner(System.in);
		initial = sc.nextLine();
		int len = initial.length();
		
		for (int i = len-1; i>=0;i--) {
			rev=rev+initial.charAt(i);
			
		}
		sc.close();
		System.out.println(rev);
	}

}
