package com.org.api;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Str {
	
	try (
		Stream<String> stream=Files.lines(Paths.get("text.txt"))){
		stream.forEach(System.out::println);
	}
	catch(Exceptio e) {
		System.out.println();
		
	}

}
