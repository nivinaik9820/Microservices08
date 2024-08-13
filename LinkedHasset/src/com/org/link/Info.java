package com.org.link;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.ArrayList;




public class Info {
	public static void main(String args[]) {
		LinkedHashSet<Student>h=new LinkedHashSet<>();
		h.stream().forEach(System.out :: println);
				
				
		h.add(new Student( 1,"nivedita","dandeli"));
		h.add(new Student( 2,"Swap","dandeli"));

		Iterator<Student> a=h.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		
	}
}
