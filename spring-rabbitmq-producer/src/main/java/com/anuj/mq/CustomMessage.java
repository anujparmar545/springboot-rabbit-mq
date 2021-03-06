package com.anuj.mq;

import java.util.Date;

import lombok.ToString;


@ToString
public class CustomMessage {

	private String messageId;
	private String message;
	private Date messDate;
	
	public CustomMessage() {}
	
	public CustomMessage(String messageId, String message, Date messDate) {
		this.messageId = messageId;
		this.message = message;
		this.messDate = messDate;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getMessDate() {
		return messDate;
	}

	public void setMessDate(Date messDate) {
		this.messDate = messDate;
	}

	@Override
	public String toString() {
		return "CustomMessage [messageId=" + messageId + ", message=" + message + ", messDate=" + messDate + "]";
	}
	
	
}
