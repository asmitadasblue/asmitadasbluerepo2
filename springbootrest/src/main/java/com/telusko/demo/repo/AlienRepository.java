package com.telusko.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.demo.model.Alien;

@Repository
public interface AlienRepository extends CrudRepository<Alien, Integer> {

}

