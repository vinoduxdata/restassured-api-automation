package mavpro;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PostRestApi {

    private static String requestBody = "{\n" +
    		"  \"bookid\": 5438,\n" +
    		"  \"bookname\": \"JDBC and J2EE\",\n" +
    		"  \"author\": \"Ramachandra\",\n" +
    		"  \"price\" : 1000 \n}";

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
                .post("/books")
                .then()
                .extract().response();
        System.out.println(response.asString());
       // System.out.println(requestBody);

        Assert.assertEquals(200, response.statusCode());
        
        
        
//        Assert.assertEquals(5438, response.jsonPath().getString("bookid"));
//        Assert.assertEquals("Spring and Hibernate", response.jsonPath().getString("\"bookname\""));
//        Assert.assertEquals("R. Nageswara Rao", response.jsonPath().getString("author"));
//        Assert.assertEquals(800, response.jsonPath().getString("price"));
    }
}