import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class TC03_GET {

	@Test
	void test01() {
		
		get("https://reqres.in/api/users?page=2")
		.body().asString();
		
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200);
		
	}
}
