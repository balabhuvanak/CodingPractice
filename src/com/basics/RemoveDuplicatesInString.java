package com.basics;

import java.util.Scanner;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!s.contains(String.valueOf(ch))) {
				s+=ch;
			}
		}
		System.out.println(s);
	}

}
