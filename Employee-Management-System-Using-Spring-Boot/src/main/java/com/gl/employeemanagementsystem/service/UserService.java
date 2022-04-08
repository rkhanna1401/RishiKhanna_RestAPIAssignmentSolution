package com.gl.employeemanagementsystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.employeemanagementsystem.dto.UserRegistrationDto;
import com.gl.employeemanagementsystem.entity.User;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
