package com.hcl.ex;

public class Ex3 {
	public static void show(String name) {
		throw new NullPointerException();
	}
    public static void main(String[] args) {
        try {
            show("A");
            throw new NullPointerException();
        } catch(ArithmeticException e) {
            System.out.println(e);
        } catch(NullPointerException e) {
        	//System.out.println("Error ");
        	throw new NumberFormatException();
        } catch(NumberFormatException e) {
        	System.out.println("ReThrown Error");
        }
    }
}