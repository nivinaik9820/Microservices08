package com.org.link;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;




public class HashTable {
	public static void main(String args[]) {
		ArrayList<Integer>a=new ArrayList<>();
		 HashSet<Integer> set=new HashSet();  
         set.add(1);    
         set.add(2);    
         set.add(3);   
         set.add(1);  
         Iterator<Integer> i=set.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(1);
		
	}

}
