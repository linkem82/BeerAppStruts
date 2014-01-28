package com.example.model;

import java.io.Serializable;

public class BeerType implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5284900187175806484L;
	private int id;
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	

}
