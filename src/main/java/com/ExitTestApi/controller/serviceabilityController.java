package com.ExitTestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ExitTestApi.entity.Serviceability;
import com.ExitTestApi.repo.ServiceabilityRepo;

@RestController
@CrossOrigin
public class serviceabilityController {

	
	@Autowired
	ServiceabilityRepo repo;
	
	@RequestMapping("/serviceability/{id}/{code}")
	public List<Serviceability> getID(@PathVariable("id") int id, @PathVariable("code") int code)
	{
		return repo.findByPidAndPincodes(id,code);

	}
}
