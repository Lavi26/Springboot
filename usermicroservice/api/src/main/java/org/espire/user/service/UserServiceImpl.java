package org.espire.user.service;

import org.espire.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUserById(Integer id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
