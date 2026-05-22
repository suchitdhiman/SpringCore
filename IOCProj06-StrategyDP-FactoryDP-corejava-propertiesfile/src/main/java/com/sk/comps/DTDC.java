package com.sk.comps;

public final class DTDC implements Courier {
	
	

	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String deliver(int oid) {
		
		return oid+" is assigned to delivery agent of DTDC";
	}

}
