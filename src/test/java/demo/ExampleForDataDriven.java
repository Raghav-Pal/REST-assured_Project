package demo;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ExampleForDataDriven {
	
	
		@DataProvider(name = "DataForPost")
		public Object[][] dataForPost() {
			
//			Object[][] data = new Object[2][3];
//			
//			data[0][0] = "Thomas";
//			data[0][1] = "Edison";
//			data[0][2] = 1;
//			
//			data[1][0] = "Albert";
//			data[1][1] = "Einstein";
//			data[1][2] = 2;
//			
//			return data;
			
			return new Object [][]{
				{"Albert", "Einstein", 2},
				{"Thomas", "Edison", 1},
				{"Henry", "Ford", 2}
			};
		}
	
		
		//@Test(dataProvider = "DataForPost")
		public void test_post(String firstName, String lastName, int subjectId) {

			JSONObject request = new JSONObject();

			request.put("first_name", firstName);
			request.put("last_name", lastName);
			request.put("subjectId", subjectId);

			baseURI = "http://localhost:3000/";

			given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
			when().
			post("/users").
			then().
			statusCode(201)
			.log().all();

		}

		
		@DataProvider(name = "DataForDelete")
		public Object[] dataForDelete() {
			return new Object[] {
				6,9,10,11,12
			};
		}
		
		@Parameters({"userId"})
		@Test
		public void delete(int userId) {
			
			System.out.println("Value for user id is : "+userId);
			baseURI = "http://localhost:3000";

			when().delete("/users/"+userId).then().statusCode(200);
		}

}
