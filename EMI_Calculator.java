package com.lava;

import java.util.Scanner;

public class EMI_Calculator {

	public static void main(String[] args) {

		double principle, rate, time, emi, i, total;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Amount:");
		principle = a.nextFloat();

		System.out.print("Enter rate of interest in %: ");
		rate = a.nextFloat();

		System.out.print("Enter time in months: ");
		time = a.nextFloat();
		time = time / 12; // converting months to year

		i = principle * rate * time / 100;

		total = principle + i;

		time = time * 12;
		emi = total / time;
		System.out.println("interest  :" + i);
		System.out.println("monthly EMI payable: " + emi);
		System.out.println("Total amount payable: " + total);

		a.close();
	}
}
