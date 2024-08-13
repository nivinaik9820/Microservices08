package com.org.api;
import java.util.List;
import java.util.stream.Collectors;


public class Demo{
	
		public static Integer solve(int n,int x) {
			try {
				return n/x;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return -1;
			
		}
		
		public static List<Integer> divide(List<Integer> l,Integer x){
			
			return l.stream().map(n->solve(n,x)).collect(Collectors.toList());			
			
		}
	

		
}
