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

/*
 apiKey: "AIzaSyC0UT0EUYVsYWebwpvTcG-LlaIdmBqCRCs",
  authDomain: "quora-2cc0f.firebaseapp.com",
  projectId: "quora-2cc0f",
  storageBucket: "quora-2cc0f.appspot.com",
  messagingSenderId: "713658860064",
  appId: "1:713658860064:web:af7686965d05ae3adc7245"














*/
