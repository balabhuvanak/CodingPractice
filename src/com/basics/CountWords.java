package com.basics;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s==null ||s.trim().isEmpty()) {
			System.out.println(0);
		}
		else {
			// Split by one or more spaces ("\\s+")
			String[] words = s.trim().split("\\s+");
			System.out.println(words.length);
		}
	}

}
