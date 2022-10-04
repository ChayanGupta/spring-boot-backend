package com.backend.planmytrip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.planmytrip.entity.AreaOfInterest;
import com.backend.planmytrip.repository.AreaOfInterestRepo;

@Service
public class AreaOfInterestService {

	@Autowired private AreaOfInterestRepo areaOfInterestRepo;
	
	public List<AreaOfInterest> getAllOfAreaOfInterest() {
		return areaOfInterestRepo.findAll();
	}
}
