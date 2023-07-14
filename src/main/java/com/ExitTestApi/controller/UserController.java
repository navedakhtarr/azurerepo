package com.ExitTestApi.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ExitTestApi.entity.Buyers;
import com.ExitTestApi.repo.UserRepo;

@RestController
@CrossOrigin
public class UserController {

	@Autowired 
	UserRepo repo;
	
	@PostMapping(path="/users",consumes= {"application/json"})
	public boolean addUsers(@RequestBody Buyers user) 
	{
		repo.save(user);
		return true;
		
	}
	
	

	@RequestMapping("/users/{email}")
	public Optional<Buyers> getlogin(@PathVariable("email") String email)
	{
		return repo.findById(email);

	}
	
	
}
