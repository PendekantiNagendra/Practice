package com.hcl.collections;

import java.util.Scanner;

public class Scan2 {
	public static void main(String[] args) {
		System.out.println("Enter 2 nos ");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum is  " +c);
	}
}
