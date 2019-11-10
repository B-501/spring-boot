package com.b501.test1.Repository;

import org.springframework.data.repository.CrudRepository;

import com.b501.test1.DAO.User;

public interface UserRepository extends CrudRepository<User, Integer> {}