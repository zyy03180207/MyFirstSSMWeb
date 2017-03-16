package com.open.suns.service;

import com.open.suns.entity.User;

public interface UserService {

	public void register(User user);
	
	public User findById(int id);
}
