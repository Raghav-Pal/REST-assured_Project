import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC01_GET {
	
	@Test
	void getUserList() {
		
		// specify base url
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		/************/
		Response response = null;
		response = RestAssured
				.given()
				.when()
				.get("?page=2");
		
		
		System.out.println("Response is :\n"+response.getBody().asString());
		System.out.println(response.getHeader("content-type"));
		int statusCode = response.getStatusCode();
		System.out.println(response.getStatusCode());
		/************/	
		
		Assert.assertEquals(statusCode, 200);
		// create request object
		////RequestSpecification request = RestAssured.given();
		
		// create response object
		//Response response = request.request(Method.GET, "");
		//Response response2 = get("");
	}
	
	@Test
	void testGet_1() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println("==============================");
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asString());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
	}
}
