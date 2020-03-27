package com.saas.app.ws.exceptions;

public class UserServiceException extends RuntimeException{
	 
	private static final long serialVersionUID = 2793413520146480247L;

	public UserServiceException(String message){
		super(message);
	}
}
