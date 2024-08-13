package com.org.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Arraylistdemo {public Arraylistdemo() {
	// TODO Auto-generated constructor stub
}
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);


        List<String> myList= Arrays.asList("vamshi","krishna","kiran");
        Stream<String> sequentailStream= myList.stream();
        Stream<String> parallelStream= myList.parallelStream();
        //stream.of() method create a stream from individuals values.
      Stream<String> stream=Stream.of("vamshi","krishna","kiran");
    
      sequentailStream = Stream.of("vamshi","krishna");
      //stream.forEach(System.out::println);
      
      
      
      //filter(): Filter elements based on a predicate
      
      List<String>filteredList = myList.stream().filter(s -> s.startsWith("a"))
              .collect(Collectors.toList());
      
      
      
      
      
//      map() Transforms elements using a function.
      
      List<Integer> lengths = myList.stream().map(String::length)
              .collect(Collectors.toList());
      
//     sorted() sorts elements
      
      
      
       
    
       

       
       
       
        
        
        

		
	}

}
