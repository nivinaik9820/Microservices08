package com.example.kafka1.custom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageRepository {
	
	private List<String> list=new ArrayList<>();
	
	public void addMessage(String message) {
		list.add(message);
	}
	
	public String getAllMessages() {
		return list.toString();
	}

}
