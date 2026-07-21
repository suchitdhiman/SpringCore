package com.nt.ston;

public class Printer {
	  //static  ref variable to hold single object ref
	private  static  Printer INSTANCE;
	
	
	// Zero param constructor
	private  Printer() {
		System.out.println("Printer: 0-param constructor");
	}
	
	//public  static   factory method having singleton logic
	public  static   Printer  getInstance() {
		   //singleton logic
		    if(INSTANCE==null)
		    	INSTANCE=new Printer();
		    return INSTANCE;
	}

}
