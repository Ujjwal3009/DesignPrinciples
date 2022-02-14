package servicelocator;

public class ConstructorInjection {
   public static void main(String[] args) {
	   Client cl = new Client(new Service());
	   cl.start();
	   
   }

}

interface Iservice{
 void serve();	

}

class Service implements Iservice{
	public void serve() {
		System.out.println("I am serving");
		
	}
}

class Client{
	Iservice servic;
	Client(Iservice service){
		this.servic = service;
	}
	
	void start() {
		System.out.println("Service start");
		servic.serve();
	}
	
	
	
	
}

