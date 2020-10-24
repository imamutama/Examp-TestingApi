package TestingAPI.TestingAPI;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Get {
	public String url ="https://petstore.swagger.io/v2/pet/findByStatus?status=available";
	@Test
	public void getApi() {
		given()
		.when()
			.get(url)
		.then()
			.statusCode(200)
			.log().body();
		/*	.body("id", equalTo("10"))
			.body("name", equalTo("Sapi"));*/
	}

}
