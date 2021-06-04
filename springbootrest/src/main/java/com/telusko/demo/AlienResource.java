package com.telusko.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.demo.model.Alien;
import com.telusko.demo.repo.AlienRepository;


@RestController
@ComponentScan("com.telusko.repo")
public class AlienResource {
	
	@Autowired
	 AlienRepository repo;
	
	@GetMapping("aliens/{id}")
	public Optional<Alien> getAliensById(@PathVariable("id") int id){
		/*List<Alien> aliens = new ArrayList<Alien>();
		
		Alien a1 = new Alien();
		a1.setAid(1);
		a1.setAname("asmita");
		a1.setPoints(50);
		
		Alien a2 = new Alien();
		a2.setAid(2);
		a2.setAname("anirban");
		a2.setPoints(70);
		
		aliens.add(a2);
		aliens.add(a1);
		return aliens;*/
		
		return repo.findById(id);
		
	}
	
	@RequestMapping("aliens")
	public List<Alien> getAliens(){
		/*List<Alien> aliens = new ArrayList<Alien>();
		
		Alien a1 = new Alien();
		a1.setAid(1);
		a1.setAname("asmita");
		a1.setPoints(50);
		
		Alien a2 = new Alien();
		a2.setAid(2);
		a2.setAname("anirban");
		a2.setPoints(70);
		
		aliens.add(a2);
		aliens.add(a1);
		return aliens;*/
		
		List<Alien> aliens = (List<Alien>)repo.findAll();
		return aliens;
	}
	
	@PostMapping("aliens")
	public Alien createAlien(@RequestBody Alien a) {
		
		repo.save(a);
		
		return a;
		
	}
	
	@PutMapping("aliens")
	public Alien updateAlien(@RequestBody Alien a) {
		
		repo.save(a);
		
		return a;
		
	}
	@DeleteMapping("aliens/{id}")
	public void deleteAlien(@PathVariable("id") int id) {
		
		repo.deleteById(id);
		
		//return a;
		
	}
	
	@DeleteMapping("aliens")
	public void deleteAlienByObject(@RequestBody Alien a) {
		
		repo.delete(a);
		
		//return a;
		
	}
	
	

}
