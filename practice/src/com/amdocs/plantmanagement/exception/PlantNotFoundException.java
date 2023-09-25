package com.amdocs.plantmanagement.exception;

public class PlantNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public PlantNotFoundException()
	{}
	
	public PlantNotFoundException(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return "Something went wrong [message=" + message + "]";
	}
}
