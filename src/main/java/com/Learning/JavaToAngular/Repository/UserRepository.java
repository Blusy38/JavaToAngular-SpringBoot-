package com.Learning.JavaToAngular.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Learning.JavaToAngular.model.User;

//We need basic CRUD functionality on user entities
@Repository
public interface UserRepository extends CrudRepository<User, Long>{}
