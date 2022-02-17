package com.design.patterns.abstractFactory;

public class Driver {
	
	
	public static void main(String[] args) {
	Cricket test = ICC.getMatch(new TestMatch(90,"White"));
	Cricket T20 = ICC.getMatch(new T20Match(20,"Blue"));
	
	System.out.println("test match details ->"+ test);
	System.out.println("t20 match details ->"+ T20);
	}

}
