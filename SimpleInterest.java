package com.lava;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		float p,t,r,i;
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter princple amount: ");
		p = sc.nextFloat();
		
		System.out.println("Enter rate: ");
		r = sc.nextFloat();
		
		
		System.out.println("Enter the time in months");
		t = sc.nextFloat();
		t=t/12;
		i = p*t*r/100;
		
		
	
		System.out.println(i);
	}

}
