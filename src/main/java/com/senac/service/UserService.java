package com.senac.service;

import com.senac.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
