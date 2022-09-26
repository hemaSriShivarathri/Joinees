//package com.Utility.Joinees;
//
//import static org.mockito.Mockito.doReturn;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import com.Utility.Joinees.Dao.UtilityDao;
//import com.Utility.Joinees.Model.EmployeeLogin;
//import com.Utility.Joinees.Service.UtilityService;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//class JoineesApplicationTests {
//
//	@Autowired
//	UtilityService utilityService;
//
//	@MockBean
//	UtilityDao utiltyDao;
//
//	@Test
//	void contextLoads() {
//	}
//
//	@Test
//	@DisplayName("Test findAll")
//	void testfindAll() {
//		EmployeeLogin emp = new EmployeeLogin("123213", "HemaSrii", "HemaSrii", "HemaSrii@123");
//		EmployeeLogin emp1 = new EmployeeLogin("123235", "HemaSrii1", "HemaSrii1", "HemaSrii@1231");
//		//utiltyDao Dao Layer
//		doReturn(Arrays.asList(emp, emp1)).when(utiltyDao).findAll();
//		List<EmployeeLogin> emplist = utilityService.findAll();
//		Assertions.assertEquals(2, emplist.size(), "findAll should return 2 widgets");
//	}
//
//}
