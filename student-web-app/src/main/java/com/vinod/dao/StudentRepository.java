package com.vinod.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinod.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

	
}
