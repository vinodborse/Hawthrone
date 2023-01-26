package com.vinod.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinod.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
