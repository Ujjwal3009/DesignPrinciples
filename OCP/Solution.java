package com.solid.OCP;

public class Solution {
	
	
	public static void main(String[] args) {
		
		Epam employe1 = new JuniorSoftwareEngineer("Ujjwal","6050");
		int salary = employe1.calculateBaseSalary(120000);
		System.out.println( salary);
		Epam employe2 = new  SeniorSoftwareEngineer("Singh Ujjwal","1233");
		int salary2 = employe2.calculateBaseSalary(2400000);
		System.out.println( salary2);
	    
	}
	
	  
}

abstract class Epam{
	
	private String name;
	private String id;
	
	Epam(String id, String name){
		this.name = name;
		this.id = id;
	}
	
	abstract int calculateBaseSalary(int CTC);
	
}

class JuniorSoftwareEngineer extends Epam{

	JuniorSoftwareEngineer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculateBaseSalary(int CTC) {
		// TODO Auto-generated method stub
		return (CTC * 30)/100;
	}
	
	
	
	
	
	
	
}

class  SeniorSoftwareEngineer extends Epam{

	SeniorSoftwareEngineer(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculateBaseSalary(int CTC) {
		// TODO Auto-generated method stub
		return (CTC*45)/100;
	}
	
	
	
	
}