package com.Utility.Joinees.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Utility.Joinees.Dao.UtilityDao;
import com.Utility.Joinees.Model.EmployeeLogin;

@Service
public class UtilityServiceImpl implements UtilityService {

	@Autowired
	UtilityDao utilityDao;

	@Override
	public String getNames() {
		// TODO Auto-generated method stub
		return "Hello from HemaSrii..";
	}

	@Override
	public List<EmployeeLogin> findAll() {
		// TODO Auto-generated method stub
		return utilityDao.findAll();
	}

}
