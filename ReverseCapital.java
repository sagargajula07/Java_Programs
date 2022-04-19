package com.programs;

import java.util.Scanner;

public class ReverseCapital {

	public  String reverseString(String input1) {

		char ch[] = input1.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
         // String str = rev.toLowerCase();
		String words[] = rev.split("\\s");
		String capitalizeWord = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord += first.toUpperCase() + afterfirst + " ";
		}

		return capitalizeWord.trim();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter word");
		String input1 = sc.nextLine();
		ReverseCapital k = new ReverseCapital();
		System.out.println(k.reverseString(input1));

		sc.close();
	}

}
