package com.org.link;
import java.util.Hashtable;
import java.util.Enumeration;




public class Hash1 {
	public static void main(String args[]) {
		
		 Hashtable<Integer,String> set=new Hashtable<>();  
         set.put(1,"n");    
         set.put(2,"s");    
         set.put(3,"v");   
         set.put(1,"c");  
         System.out.println(set.getOrDefault(1, "true"));  
         Enumeration<Integer>em=set.keys();
         while(em.hasMoreElements()) {
             int key = em.hElement();
             System.out.println(key);
             
         }


	}
}







