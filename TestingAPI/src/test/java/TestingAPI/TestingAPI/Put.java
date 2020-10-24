package TestingAPI.TestingAPI;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class Put {
	public String url = "https://petstore.swagger.io/v2/user/Tama";
	@Test
	public void putAPI() {
		HashMap<String,Object> dataResponse = new HashMap<String,Object>();
		dataResponse.put("id", "40");
		dataResponse.put("username", "Tamaimam");
		dataResponse.put("firstName", "Imam Setya");
		dataResponse.put("lastName", "Utama");
		dataResponse.put("email", "utamaimam@gmail.com");
		dataResponse.put("password", "12356");
		dataResponse.put("phone", 124125);
		dataResponse.put("userStatus", 1);
		//System.out.println(dataResponse)
		 given().contentType("application/json")
		 	.body(dataResponse)
		 .when()
		 	.put(url)
		 .then()
		 	.statusCode(200)
		 	.log().body();
	}

}
