package com.example.string;

public class ReverseString {

	public static String reverse(String input) {

		if (input == null) {
			return input;
		}

		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}

		return output;
	}

	public static void main(String[] args) {
		String st = "Hi Om";
		System.out.println("Reverse :: "+reverse(st));
	}
}
