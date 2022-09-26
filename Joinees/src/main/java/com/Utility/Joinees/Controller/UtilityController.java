package com.Utility.Joinees.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Utility.Joinees.Dao.UtilityDao;
import com.Utility.Joinees.Model.EmployeeLogin;

@RestController
@CrossOrigin(origins = { "http://localhost:3000" })
@RequestMapping("/sunera")
public class UtilityController {

	@Autowired
	UtilityDao utilityDao;

	@GetMapping("/loginpage")
	public String loginpage() {
		// login logic
//		Optional<EmployeeLogin> empdetailsList = new ArrayList<>();
		Optional<EmployeeLogin> empdetailsList = utilityDao.getRole("101001", "Hema@123");
		System.out.println("empdetails :" + empdetailsList.toString());
		return empdetailsList.toString();
	}

	@GetMapping("/hello")
	public String hello() {
		return "Welcome...";
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestParam("empId") String empId, @RequestParam("password") String password,
			@RequestParam("role") String role) {
//		Optional<EmployeeLogin> empdetailsList = new ArrayList<>();
		Optional<EmployeeLogin> empdetailsList = utilityDao.getRole(empId, password);
		// login logic
		return empdetailsList.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//		if (empdetailsList.size() > 0) {
//			return "Login Successful...";
//		} else
//			return "Invalid Credentials";
	}
}
