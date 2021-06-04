package com.telusko.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.telusko.demorest.model.Alien;
import com.telusko.demorest.repo.AlienMockRepo;

@Path("aliens")
public class AlienResource {
	
	AlienMockRepo repo = new AlienMockRepo();

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Alien> getAliens() {
		System.out.println("inside alien resource");
		return repo.getAliens();
	}
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien getAlienById(@PathParam("id") int id) {
		System.out.println("inside get alien by id in resource");
		return repo.getAlienById(id);
		
	}
	
	@POST
	@Path("createalien")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien createAlien(Alien a) {
		System.out.println(a);
		repo.createAlien(a);
		return a;
	}
	
	@PUT
	@Path("updatealien")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien updateAlien(Alien a) {
		System.out.println(a);
		if(repo.getAlienById(a.getId()) == null) {
			repo.createAlien(a);
		}else {
			repo.updateAlien(a);
		}
		return a;
	}
	
	@DELETE
	@Path("delete/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien deleteAlien(@PathParam("id") int aid) {
		System.out.println(aid);
		Alien a = repo.getAlienById(aid);
		
		repo.deleteAlien(aid);
		return a;
	}
}
