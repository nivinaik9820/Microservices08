package com.org.act;

import org.springframework.stereotype.Repository;

@Repository

public class Movies {
	public Movies add(String mname) {
		if(mname==null) {
			throw new RuntimeException();
		}
		else {
			System.out.println("Movie added");
		}
		return new Movies();
	}
	public boolean delete(String mname) {
		
		if(mname==null) {
			throw new RuntimeException();
		}
		else {
			return true;

		}
		
	}
	
	
	
}

