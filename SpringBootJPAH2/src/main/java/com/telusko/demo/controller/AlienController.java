package com.telusko.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

//@Controller
@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam("aid") int aid) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ShowAlien");
		Alien alien  = repo.findById(aid).orElse(new Alien());
		mv.addObject("alien", alien);
		
		return mv;
	}
	
	@RequestMapping("/deleteAlien")
	public ModelAndView deleteAlien(@RequestParam("aid") int alienId) {
		
		ModelAndView mv = new ModelAndView("home");
		repo.deleteById(alienId);
		return mv;
		
	}
	
	@RequestMapping("/updateAlien1")
	public ModelAndView updateAlien1(@RequestParam("aid") int aid) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateAlien");
		Alien alien  = repo.findById(aid).orElse(new Alien());
		mv.addObject("alien", alien);
		
		return mv;
	}
	@RequestMapping("/updateAlien2")
	public ModelAndView updateAlien2(Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		repo.save(alien);
		
		
		return mv;
	}
	
	@RequestMapping("/findByLang")
	public ModelAndView findByLang(@RequestParam("lang") String lang) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ShowAlien");
		//List<Alien> alienList = repo.findByLang(lang);
		List<Alien> alienList = repo.findByQueryLangOrderByName(lang);
		System.out.println("alienList == "+alienList);
		mv.addObject("alien", alienList);
		
		return mv;
	}
	
	//@RequestMapping("/alien")
	//@ResponseBody
	public String getAllAliens() {
		return repo.findAll().toString();
	}
	
	@RequestMapping("/aliens/{aid}")
	//@ResponseBody
	public String getAlienById(@PathVariable("aid") int id) {
		return repo.findById(id).toString();
	}
	
	/*
	 * now how to do with jpa. we will be returning a list and changing the 
	 * method to return list. this is jason formatting. 
	 * how to now send or convert the inout dat to jason format.
	 * this was what output we are getting that got converted to JSON
	 * 
	 */
	@RequestMapping(path="/alien", produces= {"application/json","application/xml"}) //by 
	//default Request mapping uses get. u can use GetMapping annotation.
	//also instead of having @resonsebidy in each method we can declare the controller
	//as RestController
	//@ResponseBody
	public List<Alien> getAllAliensJPA() {
		return repo.findAll();
	}
	
	@GetMapping(path="/alien/{aid}", produces= {"application/xml","application/json"})
	//@ResponseBody
	public Optional<Alien> getAlienByIdJPA(@PathVariable("aid") int id) {
		return repo.findById(id);
	}
	@PostMapping(path="/alien" , consumes= {"application/json"})
	//@ResponseBody
	public Alien addAlienJPA(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
		
		
	}
	@DeleteMapping(path="/alien/{aid}")
	public String deleteAlienJPA(@PathVariable("aid") int aid) {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
		
		
	}
	
	@PutMapping(path="/alien", consumes = {"application/json"})
	public Alien updatelienJPA(@RequestBody Alien alien) {
		
		repo.save(alien);
		return alien;
		
		
	}
	
	
}
