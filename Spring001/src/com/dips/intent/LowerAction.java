package com.dips.intent;

public class LowerAction implements Action{
	String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String execute(String str) {
		return str.toLowerCase();
	}

}
