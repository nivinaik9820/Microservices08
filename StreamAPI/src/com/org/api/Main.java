package com.org.api;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]) {
		ArrayList<Employee> a=new ArrayList();
		a.add(new Employee(1,"nivi",23,25,"f",60000));
		a.add(new Employee(2,"swap",25,25,"g",80000));

		a.add(new Employee(3,"sagar",26,25,"g",40000));
		a.add(new Employee(4,"nikki",25,25,"f",50000));
		

		Map<String, Long> a2= a.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		a2.forEach((gender, count) -> System.out.println("count  =  "+gender + ":"+count));

		
		
		

		
	}

}
