package com.backend.planmytrip.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.planmytrip.entity.Activity;
import com.backend.planmytrip.entity.ActivityandPackage;
import com.backend.planmytrip.entity.AreaOfInterest;
import com.backend.planmytrip.entity.InterestandPackage;
import com.backend.planmytrip.entity.Package;
import com.backend.planmytrip.entity.Type;
import com.backend.planmytrip.entity.TypeandPackage;
import com.backend.planmytrip.repository.ActivityRepo;
import com.backend.planmytrip.repository.ActivityandPackageRepo;
import com.backend.planmytrip.repository.AreaOfInterestRepo;
import com.backend.planmytrip.repository.InterestandPackageRepo;
import com.backend.planmytrip.repository.PackageRepo;
import com.backend.planmytrip.repository.TypeRepo;
import com.backend.planmytrip.repository.TypeandPackageRepo;

@Service
public class PackageService {
	
	@Autowired private PackageRepo packageRepo;
	@Autowired private TypeandPackageRepo typeandPackageRepo;
	@Autowired private TypeRepo typeRepo;
	@Autowired private InterestandPackageRepo interestandPackageRepo;
	@Autowired private AreaOfInterestRepo areaOfInterestRepo;
	@Autowired private ActivityandPackageRepo activityandPackageRepo;
	@Autowired private ActivityRepo activityRepo;
	
	public List<Package> getAllPackages(){
		List<Package> packages = packageRepo.findAll();
		
		for(Package package1:packages) {
			List<Type> types = new ArrayList<>();
			List<TypeandPackage> typeandPackages = typeandPackageRepo.findByPackageId(package1.getId());
			for(TypeandPackage typeandPackage:typeandPackages) {
				Type type = typeRepo.findById(typeandPackage.getTypeId()).get();
				System.out.println(type);
				types.add(type);
			}
			package1.setType(types);
		}
		
		for(Package package1:packages) {
			List<AreaOfInterest> areaOfInterests = new ArrayList<>();
			List<InterestandPackage> interestandPackages = interestandPackageRepo.findByCityId(package1.getId());
			for(InterestandPackage interestandPackage:interestandPackages) {
				areaOfInterests.add(areaOfInterestRepo.findById(interestandPackage.getAreaOfInterestId()).get());
			}
			package1.setAreaOfInterest(areaOfInterests);
		}
		
		for(Package package1:packages) {
			List<Activity> activities = new ArrayList<>();
			List<ActivityandPackage> activityandPackages = activityandPackageRepo.findByCityId(package1.getId());
			for(ActivityandPackage activityandPackage:activityandPackages) {
				activities.add(activityRepo.findById(activityandPackage.getActivityId()).get());
			}
			package1.setActivities(activities);
		}
		
		return packages;
	}
}