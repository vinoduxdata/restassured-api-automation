package mavpro;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRestApi {

	 
	    @BeforeTest
	    public static void setup() {
	        RestAssured.baseURI = "http://localhost:8080";
	    }

	    @Test
	    public void postRequest() {
	    	
	        Response response = given()
	                .header("Content-type", "application/json")
	                .and()
	                .when()
	                .delete("/book/5433")
	                .then()
	                .extract().response();
	        System.out.println(response.asString());
	        
	        Assert.assertEquals(200, response.statusCode());
}
}