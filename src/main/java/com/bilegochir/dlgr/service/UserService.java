package com.bilegochir.dlgr.service;

import com.bilegochir.dlgr.entity.User;

public interface UserService {
	
	void save(User user);
	User findByUsername(String username);
	
}