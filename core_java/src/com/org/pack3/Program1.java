package com.org.pack3;

public class Program1 {
	 int id;
	 String name;
	
	Program1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void display(){
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String args[]) {
		//Program1 p =new Program1();
		Program1 p1= new Program1(101,"n");
	//	p.display(1,"Nivedita");
		
	}

}
