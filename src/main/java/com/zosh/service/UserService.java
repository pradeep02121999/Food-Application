package com.zosh.service;

import java.util.List;

import com.zosh.Exception.UserException;
import com.zosh.model.Client;

public interface UserService {

	public Client findUserProfileByJwt(String jwt) throws UserException;
	
	public Client findUserByEmail(String email) throws UserException;

	public List<Client> findAllUsers();

	public List<Client> getPenddingRestaurantOwner();

	void updatePassword(Client client, String newPassword);

	void sendPasswordResetEmail(Client client);

}
