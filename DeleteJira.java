package jiraChaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteJira extends BaseClas{
	
	@Test(dependsOnMethods= "jiraChaining.UpdateJira.updateJIRA")	
	
	//@Test(dependsOnMethods= {"jiraChaining.CreateJira.create","jiraChaining.UpdateJira.updateJIRA"})	
	public void deleteJira() {
	
	Response deleteResponse = RestAssured.given().log().all().delete("/" + jiraid);				
	
	
	deleteResponse.prettyPrint();
	System.out.println("Update Status code: "+deleteResponse.statusCode());
	}

}
