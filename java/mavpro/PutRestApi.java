package mavpro;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutRestApi {

	 private static String requestBody = "{\n" +
	    		"  \"bookid\": 5438,\n" +
	    		"  \"bookname\": \"Spring and Hibernate\",\n" +
	    		"  \"author\": \"Ramachandra\",\n" +
	    		"  \"price\" : 800 \n}";

	    @BeforeTest
	    public static void setup() {
	        RestAssured.baseURI = "http://localhost:8080";
	    }

	    @Test
	    public void postRequest() {
	        Response response = given()
	                .header("Content-type", "application/json")
	                .and()
	                .body(requestBody)
	                .when()
	                .put("/books")
	                .then()
	                .extract().response();
	        System.out.println(response.asString());
		 Assert.assertEquals(200, response.statusCode());    
}
}