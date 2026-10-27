package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class AnnagramCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine().toLowerCase();
		String s2=sc.nextLine().toLowerCase();
		/* method 1(without sort )
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				String ch=String.valueOf(s1.charAt(i));
				if(s2.contains(ch)) {
				s2=s2.replaceFirst(ch, "");
				}
				else {
					System.out.println("not Annagram");
					return;
				}
			}
		
		if(s2.isEmpty()) {
			System.out.println("Annagram");
		}
		else {
			System.out.println("not Annagram");
		}
		}
		else {
			System.out.println("not Annagram");
		}
		*/
		
		//method 2 with sort
		if(s1.length()==s2.length()) {
		char[] s11=s1.toCharArray();
		char[] s22=s2.toCharArray();
		Arrays.sort(s22);
		Arrays.sort(s11);
		if(Arrays.equals(s22,s11)) {
			System.out.println("Annagram");
		}
		else {
			System.out.println("Not Annagram");
		}
	}
		else {
			System.out.println("Not Annagram");
		}
	}

}
