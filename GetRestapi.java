package mavpro;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRestapi {
	
	@Test
	void test() {
		
	Response	response=RestAssured.get("http://localhost:8080/book");
	
	
	Assert.assertEquals(200, response.getStatusCode());
	
	System.out.println(response.asString());
	System.out.println(response.getContentType());
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	System.out.println(response.getBody());
		
	}

}
