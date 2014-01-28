package com.example.model;

import java.io.Serializable;

public class Beer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4640891585143349168L;
	private int id;
	private String name;
	private int type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

}
