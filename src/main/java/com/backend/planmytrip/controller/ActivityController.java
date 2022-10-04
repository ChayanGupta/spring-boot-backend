package com.backend.planmytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.planmytrip.entity.Activity;
import com.backend.planmytrip.service.ActivityService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/activities")
public class ActivityController {

	@Autowired private ActivityService activityService;
	
	@GetMapping("/get-all-activities")
	public List<Activity> getAllActivities(){
		return activityService.getAllActivities();
	}
	
}