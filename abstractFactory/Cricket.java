package com.design.patterns.abstractFactory;


	

public abstract class Cricket {
	public abstract int getOvers();
	public abstract String getDress();
	
	@Override
	public String toString() {
		return ("Over"+this.getOvers()+" Dress"+ this.getDress());
		}

}

class Test extends Cricket{

	int Overs;
	String Dress;
	    Test(int Overs, String Dress) {
		this.Overs = Overs;
		this.Dress = Dress;
	}
	@Override
	public int getOvers() {
		// TODO Auto-generated method stub
		return this.Overs;
	}

	@Override
	public String getDress() {
		// TODO Auto-generated method stub
		return this.Dress;
	}
	
}

class T20 extends Cricket{
	int Overs;
	String Dress;
	    T20(int Overs, String Dress) {
		this.Overs = Overs;
		this.Dress = Dress;
	}

	@Override
	public int getOvers() {
		// TODO Auto-generated method stub
		return Overs;
	}

	@Override
	public String getDress() {
		// TODO Auto-generated method stub
		return Dress;
	}
	
	
	
}





