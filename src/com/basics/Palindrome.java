package com.basics;

import java.util.Scanner;

//9.palindrome
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPalindrome=checkPalindrome(n);
		System.out.println("n is palindrome or not :"+isPalindrome);
	}

	private static boolean checkPalindrome(int n) {
		// TODO Auto-generated method stub
		int rem=0;
		int sum=0;
		int x=n;
		if(x<0) {
			return false;
		}
		else {
		do{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}while(n!=0);
		if(x==sum) {
			return true;
		}
		else {
			return false;
		}
	}

}
}
