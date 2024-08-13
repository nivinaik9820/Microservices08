package com.org.act;

import org.springframework.stereotype.Repository;

@Repository

public class Actor {
	public Actor add(String name) {
		if(name==null) {
			throw new RuntimeException();
		}
		else {
			System.out.println("Movie added");
		}
		return new Actor();
	}
	public boolean delete(String name) {
		
		if(name==null) {
			throw new RuntimeException();
		}
		else {
			return true;

		}
		
	}
	

}
