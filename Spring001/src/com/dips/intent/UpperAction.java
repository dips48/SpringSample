package com.dips.intent;

public class UpperAction implements Action{
	String message;
	@Override
	public String execute(String str) {
		return message.toUpperCase();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
