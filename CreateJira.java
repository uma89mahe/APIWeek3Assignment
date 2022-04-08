package jiraChaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateJira extends BaseClas{

	@Test
	public void create() {
		RequestSpecification inputRequest = RestAssured
				.given()
				.log()
				.all()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body("{\r\n" + 
						"    \"fields\":{\r\n" + 
						"        \"project\":{\r\n" + 
						"            \"key\":\"AP\"\r\n" + 
						"        },\r\n" + 
						"        \"summary\":\"create issue in RA Project\",\r\n" + 
						"        \"description\":\"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
						"        \"issuetype\":{\r\n" + 
						"            \"name\": \"Bug\"\r\n" + 
						"        }\r\n" + 
						"    }\r\n" + 
						"}");
	
		Response createResponse = inputRequest.post();
		createResponse.prettyPrint();
		System.out.println("Status code: "+createResponse.statusCode());
		JsonPath jsonPath = createResponse.jsonPath();
		jiraid=jsonPath.get("id");
		System.out.println("CreateResponse Jira ID: "+ jiraid );
	
	}
	
}
