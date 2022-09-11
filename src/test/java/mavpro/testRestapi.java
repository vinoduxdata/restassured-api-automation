package mavpro;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class testRestapi {
	
	@BeforeTest
    public static void setup() {
        RestAssured.baseURI = "http://localhost:8080";
    }

    @Test
    public void getRequest() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/book")
                .then()
                .extract().response();
        System.out.println(response.asString());

        Assert.assertEquals(200, response.statusCode());
	

}
}





