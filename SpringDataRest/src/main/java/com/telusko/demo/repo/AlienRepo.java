package com.telusko.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telusko.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{
	
	List<Alien> findByLang(String lang);
	
	
	@Query("from Alien where lang= ?1 order by aname")
	List<Alien> findByQueryLangOrderByName(String lang);

}

