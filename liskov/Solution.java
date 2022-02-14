package com.solid.liskov;

public class Solution {

	
	public static  void main(String[] args) {
		
		String file = "xml";
		
		ParentReadLog reads = null;
		
		if(file.equalsIgnoreCase("txt")) reads = new ChildLogReadText();
		else if(file.equalsIgnoreCase("xml")) reads = new ChildLogReadXml();

		reads.readLog();
	}
	

}
class ParentReadLog{
	
	
	void readLog() {
		System.out.println("Read Log files");
	}
	
	
	
}

class ChildLogReadText extends ParentReadLog{
	
	
	void readLog() {
		System.out.println("Read log From text");
	}
}

class ChildLogReadXml extends ParentReadLog{
	
	void readLog() {
		
		System.out.println("Read log from xml");
	}
}