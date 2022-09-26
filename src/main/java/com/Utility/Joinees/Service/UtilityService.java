package com.Utility.Joinees.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Utility.Joinees.Model.EmployeeLogin;

@Service
public interface UtilityService {

	public String getNames();
	
	public List<EmployeeLogin> findAll();
}
