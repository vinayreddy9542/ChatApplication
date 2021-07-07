package com.vinay.chatapplication.model;

public class Message {
	private String content, sender;
	private messagetype type;

	public enum messagetype {
		CHAT, JOIN, LEAVE
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public messagetype getType() {
		return type;
	}

	public void setType(messagetype type) {
		this.type = type;
	}
}
