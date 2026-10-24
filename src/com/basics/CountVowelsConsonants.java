package com.basics;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next().toLowerCase();
		int v=0;
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch >='a' && ch<='z') {
				if("aeiou".contains(String.valueOf(ch))) {
					v++;
				}
				else {
					c++;
				}
			}
		}
		System.out.println("Vowels count: "+v+" Consonants count: "+c);
	}

}
