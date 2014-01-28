package com.example.action;

import com.example.model.User;
import com.example.utility.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UserAction extends ActionSupport implements ModelDriven<User>, Preparable {
	
	private static final long serialVersionUID = 3552499953398273983L;
	private User user;
	private String emailId;
	private UserService service;
	
	public User getModel() {
	return user;
	}
	public void setUserService(UserService service) {
	this.service = service;
	}
	public void setEmailId(String emailId) {
	this. emailId = emailId;
	}
	public String getEmailId() {
	return emailId;
	}
	public void prepare() throws Exception {
		if( emailId==null || "".equals(emailId) ) {
			user = new User();
		} else {
			user = service.findByEmail(emailId);
		}
	}	
	public String find() {
		return INPUT;
	}
	public String update() {
		service.persist(user,emailId);
		return SUCCESS;
	}

}
