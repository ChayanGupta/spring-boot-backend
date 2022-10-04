package com.backend.planmytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.planmytrip.entity.AreaOfInterest;
import com.backend.planmytrip.service.AreaOfInterestService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/area-of-interest")
public class AreaOfInterestController {

	@Autowired private AreaOfInterestService areaOfInterestService;
	
	@GetMapping("/get-all-area-of-interest")
	public List<AreaOfInterest> getAllAreaOfInterest(){
		return areaOfInterestService.getAllOfAreaOfInterest();
	}
}
