package com.revature;

public class Challenge1 {
	public static void main(String... args) {
		System.out.println("First challenge: ");
		System.out.println(secondHigh(new int[] {1, 2, 3}));
		System.out.println(secondHigh(new int[] {10, 15, 5}));
		System.out.println(secondHigh(new int[] {100, 999, 500}));
		System.out.println("Second challenge: ");
		System.out.println(filterString("ab1231da"));
		
	}
	
	// Find the second highest value in int array
	public static int secondHigh(int[] vals) {
		int highest = Integer.MIN_VALUE, high = Integer.MIN_VALUE;
		for(int current: vals) {
			if(current > highest) {
				high = highest;
				highest = current;
			} else if(current > high) {
				high = current;
			}
		}
		return high;
	}
	
	// Using ascii table to determine if char is a number from 0-9
	public static long filterString(String vals) {
		long charCount = vals.chars().filter(ch -> ch > 47 && ch < 58).count();
		return vals.chars().filter(ch -> ch > 47 && ch < 58).sum() - (charCount*48);
	}
}
