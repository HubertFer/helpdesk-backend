package com.dev.helpdesk.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dev.helpdesk.api.entities.User;

public interface UserRepository extends MongoRepository<User, String>{

	User findByEmail(String email);
}
