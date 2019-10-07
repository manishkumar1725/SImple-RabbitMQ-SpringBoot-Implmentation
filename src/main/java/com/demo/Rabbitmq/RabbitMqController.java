package com.demo.Rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {
	
	 @Autowired
	  RabbitMqService rabbitMqService;

	    @PostMapping("/post")
	    public ResponseEntity<String> postMessage(@RequestBody Model model){
	        rabbitMqService.sendMessage(model);
	        return new ResponseEntity<String>("Item pushed to RabbitMQ",HttpStatus.CREATED);

}
}
