package com.java.practice;

public class Attendance {

	public static void display(Object...ob) {
		for (Object object : ob) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	public static void show(int day,String...name) {
		System.out.print(day + " ");
		for (String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		show(1);
		show(2,"Visalakshi","Prem");
		show(3,"Visalakshi","Prem","Praveen","Janani","Jehan");
		show(4,"Rishab","Satya","Sai Kumar");
		
		display();
		display("Ram",12,true,12.5);
	}
}
