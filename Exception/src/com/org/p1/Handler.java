package com.org.p1;
import java.util.*;
import java.util.Scanner;


 class Error extends Exception{
	
	    static String vote="You are not allowed for voting";

	    public Error() {
	        super(vote);
	    }
	    
}
class Handler {
	    public static void main(String[] args) throws Error{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your Age");
	    int n=sc.nextInt();
	    if(n>18) {
	        System.out.println("You are Eligible for Voting");
	    }
	    else {
	    throw new Error();
	    }
	    }
	   
	}

