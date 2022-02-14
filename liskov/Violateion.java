package com.solid.liskov;

public class Violateion {
	
	public static void main(String[] args) {
		String file = "xml";
		
		ReadLog read = null;
		
		if(file.equalsIgnoreCase("txt")) read = new LogReadText();
		else if(file.equalsIgnoreCase("xml")) read = new LogReadXml();
	
		read.readLog();
	}
	


}
class ReadLog{
	
	
	void readLog() {
		System.out.println("Read Log files");
	}
	
	
	
}

class LogReadText extends ReadLog{
	
	
	void readLog() {
		System.out.println("Read log From text");
	}
}

class LogReadXml extends ReadLog{
	
	void read() {
		
		System.out.println("Read log from xml");
	}
}