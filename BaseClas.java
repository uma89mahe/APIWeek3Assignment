package jiraChaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClas {
	
	public static String jiraid;
	
	@BeforeMethod
	public void setUp() {
		
		

	RestAssured.baseURI = "https://restapijira.atlassian.net/rest/api/2/issue";
	RestAssured.authentication = RestAssured.preemptive().basic("RestAPIJira@gmail.com",
			"LQHwrjixuCa4eXz5mVKH7489");
}
}
