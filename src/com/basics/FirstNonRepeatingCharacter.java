package com.basics;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		boolean found=false;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(s1.indexOf(ch)==s1.lastIndexOf(ch)) {
				System.out.println(ch);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("No unique character found");
		}
	}

}
