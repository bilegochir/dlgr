package com.bilegochir.dlgr.service;

public interface SecurityService {
	String findLoggedInUsername();

	void autologin(String username, String password);
}
