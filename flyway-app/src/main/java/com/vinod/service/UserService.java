package com.vinod.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.dao.RoleRepository;
import com.vinod.dao.UserRepository;
import com.vinod.model.Role;
import com.vinod.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	
	public User addUser(User user) {
		Role role = roleRepository.findByName("ROLE_USER");
		user.setRoles(Arrays.asList(role));
		User addedUser = userRepository.save(user);
		return addedUser;
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		Iterable<User> usersData = userRepository.findAll();
		usersData.forEach(users::add);
		return users;
	}

}
