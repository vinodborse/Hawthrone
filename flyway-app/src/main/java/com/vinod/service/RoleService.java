package com.vinod.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.dao.RoleRepository;
import com.vinod.model.Role;

@Service
public class RoleService {

	@Autowired
	RoleRepository roleRepository;
	
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}
}
