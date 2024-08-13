package com.example.ProducerService.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProducerService.Book;
@RestController
@RequestMapping(path="/Book")
public class Controller1 {
	@Autowired
	
	Environment env;
	@GetMapping("/Book")

	public String  getBookData() {
		return env.getProperty("local.server.port");
	}
	
	@GetMapping("/id")
	public Book getBookById(@PathVariable Integer id) {
		return new Book();
	}
	@GetMapping("/all")

	public List<Book> getAllBook(){
		List<Book> l=new ArrayList<Book>();
		  l.add(new Book(101,"kindle",20000));
	        l.add(new Book(102,"hod",50000));
	        l.add(new Book(103,"got",30000));
	        l.add(new Book(104,"vikings",10000));
		return l;
		
	}

}
