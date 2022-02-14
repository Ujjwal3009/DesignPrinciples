package Di;

public class ServiceLocator {
	
	

}

interface Iservice{
	void serve();
	
}

class Service implements Iservice{
	public void serve() {
		System.out.println("Service is Serving");
		
	}
}


class Locators{
	static Iservice service ;
	
	static Iservice getObj() {
		if(service == null) service = new Service();
		
		return service;
	}
}

class Client{
	Iservice service;
	Client(){
		service = Locators.getObj();
	}
	void start() {
		System.out.println("Service starting");
		this.service.serve();
	}
	
	
}