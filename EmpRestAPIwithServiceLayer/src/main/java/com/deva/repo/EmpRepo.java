package com.deva.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deva.model.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer> {

}