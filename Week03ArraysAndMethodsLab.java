//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

import java.util.Arrays;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {

		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] arr = { 1, 5, 2, 8, 13, 6 };

		// 2. Print out the first element in the array
		System.out.println("first element in the array: " + arr[0]);

		// 3. Print out the last element in the array without using the number 5
		System.out.println("last element in the array: " + arr[arr.length - 1]);

		// 4. Print out the element in the array at position 6, what happens?
		// System.out.println(arr[6]);
		System.out.println("Print out the element in the array at position 6 results in an out of bounds error");

		// 5. Print out the element in the array at position -1, what happens?
		// System.out.println(arr[-1]);
		System.out.println("Print out the element in the array at position -1 results in an out of bounds error");

		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("Write a traditional for loop that prints out each element in the array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("Write an enhanced for loop that prints out each element in the array");
		for (int element : arr)
			System.out.println("element :" + element);

		// 8. Create a new variable called sum, write a loop that adds
		// each element in the array to the sum
		int sum = 0;
		for (int e : arr)
			sum += e;
		System.out.println("sum :" + sum);

		// 9. Create a new variable called average and assign the average value of the
		// array to it
		double average = (double) sum / arr.length;
		System.out.println("average :" + average);

		// 10. Write an enhanced for loop that prints out each number in the array
		// only if the number is odd
		System.out.println("Print only odd numbers");
		System.out.println("Print only odd numbers");
		for (int e : arr) {
			if (e % 2 == 1) {
				System.out.println(e);
			}
		}

		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and
		// "Robert"
		String[] names = { "Sam", "Sally", "Thomas", "Robert" };

		// 12. Calculate the sum of all the letters in the new array
		int summOfLetters = 0;
		for (String name : names)
			summOfLetters += name.length();
		System.out.println("sum of all the letters in the array: " + summOfLetters);

		//
		// Methods:
		//

		// 13. Write and test a method that takes a String name and prints out a
		// greeting.
		// This method returns nothing.
		greeting("Patrick");

		// 14. Write and test a method that takes a String name and
		// returns a greeting. Do not print in the method.
		System.out.println(newGreeting("Patrick"));

		// Compare method 13 and method 14:
		// a. Analyze the difference between these two methods.
		// b. What do you find?
		// c. How are they different?
		System.out.println("The difference between these two methods is that the first method being a void method");
		System.out.println(" prints a greeting inside the method call, the second returns a string which is not ");
		System.out.println("printed by the method, but can be used as an argument in a sysout to print the String");

		// 15. Write and test a method that takes a String and an int and
		// returns true if the number of letters in the string is greater than the int
		System.out.println("string is greater: " + numLettersIsGreater("This is a string", 10));

		// 16. Write and test a method that takes an array of string and a string and
		// returns true if the string passed in exists in the array
		System.out.println("Exists in array: " + stringExistsInArray(names, "Sam"));

		// 17. Write and test a method that takes an array of int and
		// returns the smallest number in the array
		System.out.println("minimum value in int array: " + minimumValue(arr));

		// 18. Write and test a method that takes an array of double and
		// returns the average
		double[] dblArray = { 1.0, 2.0, 10.5, 18.75 };
		System.out.println(getAverageOfDouble(dblArray));

		// 19. Write and test a method that takes an array of Strings and
		// returns an array of int where each element
		// matches the length of the string at that position
		System.out.println("getStringLengths: " + Arrays.toString(getStringLengths(names)));

		// 20. Write and test a method that takes an array of strings and
		// returns true if the sum of letters for all strings with an even amount of
		// letters
		// is greater than the sum of those with an odd amount of letters.
		String[] testArray = { "Phil", "Sally", "Joel", "Jacob", "Mark" };
		System.out.println("evenSumIsGreater: " + evenSumIsGreater(testArray));

		// 21. Write and test a method that takes a string and
		// returns true if the string is a palindrome
		String pal = "racecar";
		System.out.println("String is a palindrome: " + isPalindrome(pal));

	}

	// Method 13:
	private static void greeting(String name) {
		System.out.println("Hello " + name);

	}

	// Method 14:
	private static String newGreeting(String name) {
		return "Hello " + name;
	}

	// Method 15:
	private static boolean numLettersIsGreater(String str, int num) {
		return str.length() > num;
	}

	// Method 16:
	private static boolean stringExistsInArray(String[] arr, String str) {
		boolean result = false;
		for (String s : arr) {
			if (s.equals(str)) {
				result = true;
			}
		}
		return result;
	}

	// Method 17:
	private static int minimumValue(int[] arr) {
		int min = 2147483647;
		for (int test : arr) {
			if (test < min) {
				min = test;
			}
		}
		return min;
	}

	// Method 18:
	private static double getAverageOfDouble(double[] arr) {
		// double average = 0;
		double sum = 0;
		for (double element : arr)
			sum += element;
		return sum / arr.length;
	}

	// Method 19:
	private static int[] getStringLengths(String[] arr) {
		int[] resultArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			resultArray[i] = arr[i].length();
		}
		return resultArray;
	}

	// Method 20:
	private static boolean evenSumIsGreater(String[] arr) {
		int evenSum = 0;
		int oddSum = 0;
		for (String s : arr) {
			if (s.length() % 2 == 0)
				evenSum += s.length();
			else
				oddSum += s.length();
		}
		return evenSum > oddSum;
	}

	// Method 21:
	private static boolean isPalindrome(String word) {
		int length = word.length();
		for (int index = 0; index < length / 2; index++) {
			if (word.charAt(index) != word.charAt(length - index - 1)) {
				return false;
			}
		}
		return true;
	}

}