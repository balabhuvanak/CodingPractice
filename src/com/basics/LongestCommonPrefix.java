package com.basics;

import java.util.Scanner;

//14.Longest Common Prefix
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			str[i]=sc.next();
		}
		
		String prefix=str[0];
		for(int i=1;i<str.length-1;i++) {
			if(!(str[i].indexOf(prefix)==0)){
				prefix=str[i].substring(0,prefix.length()-i);
			}
		}
		if(prefix.isEmpty()) {
			System.out.println("No common prefix is present");
		}
		else {
			System.out.println("longest common prefix is: "+prefix);
		}
		
	}

}
