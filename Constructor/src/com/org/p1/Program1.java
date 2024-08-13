package com.org.p1;

public class Program1 {
	 int id;
	 String name;
	
	 private Program1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void display(){
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String args[]) {
		//Program1 p =new Program1();
		Program1 p1= new Program1(10,"b");
		p1.display();
		
	}
}
