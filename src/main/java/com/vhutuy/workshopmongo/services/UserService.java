package com.vhutuy.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vhutuy.workshopmongo.domain.User;
import com.vhutuy.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> FindAll() {
		return repo.findAll();
	}
}
