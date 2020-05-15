package demo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Tests_GET {
	
	//@Test
	public void test_1() {
		
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7));
	}

	
	//@Test
	public void test_2() {
		
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[0]", equalTo(7))
			.log().all();
	}
	
	@Test
	public void test_3() {
		
		given()
			.param("Key", "values")
			.header("key", "value")
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.log().all()
			.body("data.first_name", hasItems("Michael","Lindsay"));
	}

}
