package com.niit.PlanetSportsFrontend.exception;

import java.io.Serializable;

public class ProductNotFoundException extends Exception implements Serializable
{
     
	 private static final long serialVersionUID = 1L;
 	 String message;
	 public ProductNotFoundException()
	 
	 {
		 this("This Product is not Available!..");
		 
	 }
	
	 public ProductNotFoundException(String message) 
	 {
	     this.message = System.currentTimeMillis() + ":"  + message;	
	 }

	public String getMessage() 
	{
		return message;
	}
	 
}
