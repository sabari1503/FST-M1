package RestAPI;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;



public class Activity6 {
	// Set Base URL
	String ROOT_URI = "https://petstore.swagger.io/v2/pet";

	@Test
	public void getPetInfo() throws MalformedURLException {
	    // Generate response
	    Response response = 
	        given().contentType(ContentType.JSON) // Set headers
	        .when().get(ROOT_URI + "/77232"); // Send GET request

	    // Print response
	    System.out.println(response.asPrettyString());

	    // Validate JSON Schema from URL
	    URL swaggerSchema = new URL("https://petstore.swagger.io/v2/swagger.json");
	    response.then().body(matchesJsonSchema(swaggerSchema));
	}
}
