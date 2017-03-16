package com.open.suns.dao;

import com.open.suns.entity.User;

public interface UserDao {
	
	public void register(User user);
	
	public User findById(int id);
}
