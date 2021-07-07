package com.vinay.chatapplication.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import com.vinay.chatapplication.model.Message;

@Controller
public class AppController {

	@MessageMapping("/chat.register")
	@SendTo("/topic/public")
	public Message register(@Payload Message message, SimpMessageHeaderAccessor smh) {
		smh.getSessionAttributes().put("username", message.getSender());
		return message;
	}

	@MessageMapping("/chat.send")
	@SendTo("/topic/public")
	public Message sendMessage(Message message) {
		return message;
	}
}
