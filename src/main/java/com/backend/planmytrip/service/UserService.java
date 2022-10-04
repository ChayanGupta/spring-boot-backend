package com.backend.planmytrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.planmytrip.dto.UserDto;
import com.backend.planmytrip.entity.User;
import com.backend.planmytrip.helper.UserDtoHelper;
import com.backend.planmytrip.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired private UserRepo repo;
	@Autowired private UserDtoHelper dtoHelper;
	
	public UserDto login(UserDto userDto) {
		User isUserExist  = repo.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
		if(isUserExist==null) {
			return null;
		}
		return dtoHelper.convertUserToUserDto(isUserExist);
	}
	
	public UserDto register(UserDto userDto) {
		User isUserExist = repo.findByEmail(userDto.getEmail());
		if(isUserExist!=null) {
			return null;
		}
		User registeredUser  = repo.save(dtoHelper.convertUserDtoToUser(userDto));
		return dtoHelper.convertUserToUserDto(registeredUser);
	}
}