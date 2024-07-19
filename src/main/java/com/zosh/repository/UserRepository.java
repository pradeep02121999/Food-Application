package com.zosh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zosh.model.Client;

public interface UserRepository extends JpaRepository<Client, Long> {
	
	
	
	@Query("SELECT u FROM Client u Where u.status='PENDING'")
	public List<Client> getPenddingRestaurantOwners();
	
	public Client findByEmail(String username);

}
