//package com.Utility.Joinees;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.TestInstance.Lifecycle;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//@TestInstance(Lifecycle.PER_CLASS)
//public class UtilityDaoTest extends JoineesApplicationTests {
//	@Autowired
//	private WebApplicationContext webAppContext;
//
//	private MockMvc mockMVC;
//	
//	@BeforeAll
//	public void setup() {
//		mockMVC=MockMvcBuilders.webAppContextSetup(webAppContext).build();
//	}
//	
//	@Test
//	public void testemployee() throws Exception{
//		mockMVC.perform(get("/sunera/employeeLogin"))
//		.andExpect(jsonPath("$.name").value("Hema")).andExpect(jsonPath("$.password").value("Hema@123"))
//		.andExpect(jsonPath("$.role").value("Javadeveloper"));
//
//}
//}
