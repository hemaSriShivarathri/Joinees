package com.Utility.Joinees.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Utility.Joinees.Model.EmployeeLogin;

@Repository
public interface UtilityDao extends JpaRepository<EmployeeLogin, Long>{
	
@Query(value ="select * from employee u where u.empId =?1 and u.password = ?2" , nativeQuery = true)	
public Optional<EmployeeLogin> getRole(String empid, String password);

@Query(value ="select * from employee u where u.empId =?1" , nativeQuery = true)	
public Boolean findAllById(String string);

//public List<EmployeeLogin> getallU

}