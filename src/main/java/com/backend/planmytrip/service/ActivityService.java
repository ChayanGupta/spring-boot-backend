package com.backend.planmytrip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.planmytrip.entity.Activity;
import com.backend.planmytrip.repository.ActivityRepo;

@Service
public class ActivityService {

	@Autowired private ActivityRepo activityRepo;
	
	public List<Activity> getAllActivities(){
		return activityRepo.findAll();
	}
}
