package com.backend.planmytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.planmytrip.entity.Package;
import com.backend.planmytrip.service.PackageService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/package")
public class PackageController {

	@Autowired private PackageService packageService;
	
	@GetMapping("/get-all-packages")
	public List<Package> getAllPackages(){
		return packageService.getAllPackages();
	}
}