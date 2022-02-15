package org.espire.user.service;

public interface UserService {

	// create
	void createUser(User user);

	// get
	User getUserById(Integer id);

	// Delete
	void deleteUserById(Integer id);

	// Update
	User updateUserById(Integer id, User user);
}
