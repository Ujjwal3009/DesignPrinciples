package com.design.patterns.abstractFactory;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPL match = BCCI.create(new Match1(20,400,"SRH"));
		match.getMatch();
		

	}

}

class BCCI{
	
	static IPL create(createMatch match) {
		return match.createMatch();
	}
}
		


interface IPL {
	
	void getMatch();
	
	
	
}


class SRHvsCSK implements IPL{

	int run;
	int overs ; 
	 String winner;
	 SRHvsCSK(int run , int overs, String winner){
		 this.run = run; 
		 this.overs = overs;
		 this.winner = winner;
	 }
	
	@Override
	public void getMatch() {
		// TODO Auto-generated method stub
		System.out.println("MAtch is SRHvsCSK run made in this match is "+ run +"in "+ overs +"  by "+winner   );
		
		
	}
	
	
	
}


class MIvsCSK implements IPL{
	int run;
	int overs ; 
	 String winner;
	 MIvsCSK(int overs, int run , String winner){
          this.run =  run;
          this.overs = overs;
          this.winner = winner;
          
	 }

	@Override
	public void getMatch() {
		// TODO Auto-generated method stub
		System.out.println("MAtch is SRHvsCSK run made in this match is "+ run +"in "+ overs +"  by "+winner   );
		
		
	}

}


interface createMatch{
	
	public IPL createMatch();
}


class Match1 implements createMatch{
	
	
    int overs;
    int run; 
    String winner;
    
    Match1(int overs, int run , String winner){
    	this.overs = overs;
    	this.run = run;
    	this.winner = winner;
    }
	@Override
	public IPL createMatch() {
		// TODO Auto-generated method stub
		return new SRHvsCSK(overs, run,"SRH");
	}
	
	
	
}
class Match2 implements createMatch{
	
	
    int overs;
    int run; 
    String winner;
    
    Match2(int overs, int run , String winner){
    	this.overs = overs;
    	this.run = run;
    	this.winner = winner;
    }
	@Override
	public IPL createMatch() {
		// TODO Auto-generated method stub
		return new MIvsCSK(overs, run,"SRH");
	}
	
	
	
}



