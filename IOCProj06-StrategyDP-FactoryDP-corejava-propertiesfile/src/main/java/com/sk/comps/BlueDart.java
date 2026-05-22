package com.sk.comps;

public final class BlueDart implements Courier {
	
	

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+" is assigned to bluedart delivery";
	}

}
