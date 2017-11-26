package com.bilegochir.dlgr.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilegochir.dlgr.entity.User;
import com.bilegochir.dlgr.repository.RoleRepository;
import com.bilegochir.dlgr.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@SuppressWarnings("unchecked")
	public void save(User user) {
		user.setPassword(user.getPassword());
		user.setRoles(new HashSet(roleRepository.findAll()));
		userRepository.save(user);
	}

	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
