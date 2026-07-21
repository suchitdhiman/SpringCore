//B.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b1")
public class B {

	//@Autowired
	private  A  a;
	
	
	
	@Autowired
	public B(A  a) {
		this.a=a;
		System.out.println("B:: 1-param constructor");
	}
	
	/*@Autowired
	public void setA(A a) {
		this.a=a;
		System.out.println("B.setA()");
	}*/
	
	/*@Autowired
	public void assign(A a) {
		this.a=a;
		System.out.println("B.assign()");
	}
	*/
	@Override
	public String toString() {
		return "B [a= B obj Data]";
	}
	

}
