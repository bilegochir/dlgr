package com.bilegochir.dlgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bilegochir.dlgr.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
