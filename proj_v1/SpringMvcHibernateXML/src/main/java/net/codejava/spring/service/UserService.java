package net.codejava.spring.service;

import net.codejava.spring.model.User;
import net.codejava.spring.repository.RegisterContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	protected RegisterContactRepository repository;
	
	public List<User> getUsername() {
		return repository.getUsername();
	}
	
	public void registerContact(User user) {
		repository.registerContact(user);
	}
}
