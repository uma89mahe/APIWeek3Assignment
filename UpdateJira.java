package jiraChaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UpdateJira extends BaseClas {
	
	@Test(dependsOnMethods= "jiraChaining.CreateJira.create")
	public void updateJIRA() {
	
	Response updateResponse = RestAssured.given().log().all().contentType(ContentType.JSON).body("{\r\n" + 
					"    \"fields\":{\r\n" + 
					"        \r\n" + 
					"        \"description\":\"Updation of Issue using the REST Assured on APR 2 2021-- first time\"\r\n" + 
					"        \r\n" + 
					"    }\r\n" + 
					"}").put("/" +jiraid);		
			
	
	System.out.println(jiraid);
	updateResponse.prettyPrint();
	System.out.println("Update Status code: "+updateResponse.statusCode());
	}

}
