package com.basics;

import java.util.Arrays;
import java.util.Scanner;

//1. Two Sum
public class TwoSum {

	public static int[] twoSum(int[] nums,int target) {
		int[] res=new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<=nums.length-1;j++) {
				if(target==nums[i]+nums[j]) {
					res[0]=i;
					res[1]=j;
				}
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int[] nums= {2,7,11,15};
		int[] result=twoSum(nums,target);
		System.out.println(Arrays.toString(result));
	}

}
