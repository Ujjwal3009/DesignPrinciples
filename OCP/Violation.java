package com.solid.OCP;

public class Violation {
	

}


class Employee{
	
	String id;
	String name;
	
	Employee(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	//Now the requirements comes that return salary on the basis of designation for this
	// we have to change in same method but OCP tell us to extend it and use accroding to it;
     double  calculateSalary(int CTC) {
		return (CTC * 30)/100 ;
	}
}

