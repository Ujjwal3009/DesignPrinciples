package com.design.patterns.abstractFactory;

public interface AbstractFactroy {
	public Cricket createMatch();

}


class TestMatch implements AbstractFactroy{
	
	private int Overs;
    private String Dress;
    
    TestMatch(int Overs, String Dress){
    	this.Overs = Overs;
    	this.Dress = Dress;
    }

	@Override
	public Cricket createMatch() {
		// TODO Auto-generated method stub
		return new Test(Overs, Dress);
	}
	
}

class T20Match implements AbstractFactroy{

	private int Overs;
    private String Dress;
    
    T20Match(int Overs, String Dress){
    	this.Overs = Overs;
    	this.Dress = Dress;
    }
	@Override
	public Cricket createMatch() {
		// TODO Auto-generated method stub
		return new T20(Overs, Dress);
	}
	
	
}
