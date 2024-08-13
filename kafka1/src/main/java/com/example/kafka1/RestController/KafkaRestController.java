package com.example.kafka1.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka1.custom.MessageRepository;
import com.example.kafka1.producer.MessageProducer;

@RestController
public class KafkaRestController {
	
	
	@Autowired
	private MessageProducer producer;
	
	@Autowired
	private MessageRepository messageRepo;
	
	
	
	@GetMapping("/send")
	public String sendMsg(@RequestParam("msg")String message) {
		producer.sendMessage(message);
		return ""+"'+message+'"+"sent successfully!";
	}
	
	
	

}
