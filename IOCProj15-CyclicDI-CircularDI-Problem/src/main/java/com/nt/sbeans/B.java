//B.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b1")
public class B {

	private  A  a;
	
	@Autowired
	public B(A  a) {
		this.a=a;
		System.out.println("B : 0-param  consturctor");
	}
	
	@Override
	public String toString() {
		return "B [a= B obj Data]";
	}
	

}
