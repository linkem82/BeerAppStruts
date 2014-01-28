package com.example.utility;

import com.example.model.User;

public interface UserService {
	
	public User findByEmail( String email );
	public void persist( User user, String emailId );

}
