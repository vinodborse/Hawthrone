package com.vinod.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinod.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

	Role findByName(String string);
}
