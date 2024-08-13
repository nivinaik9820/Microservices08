package com.org.link;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Player> b = new ArrayList<Player>();
        
        
        

		
	}

}
class Player{
	
	String name;
	int id;
	String  skill;
	String country;
	public Player(String name, int id, String skill, String country) {
		super();
		this.name = name;
		this.id = id;
		this.skill = skill;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", id=" + id + ", skill=" + skill + ", country=" + country + "]";
	}
	
	

}


