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

public class Post {

	@Test
	public void postApi() {
		HashMap<String, Object> dataID = new HashMap<String, Object>();
		dataID.put("id", 101);
		
		HashMap<String, Object> category = new HashMap<String, Object>();
		category.put("id", 112);
		category.put("name", "TestingAPI");
		dataID.put("category", category);
		dataID.put("name", "TestingAPI2");
		dataID.put("name", "TestingAPI2");
		
		HashMap<String, Object> tag1 = new HashMap<String, Object>();
		tag1.put("id", 113);
		tag1.put("name", "TestingAPI");
		
		List<Map<String, Object>> parseList = new ArrayList<Map<String, Object>>();
		parseList.add(tag1);
		
		dataID.put("tags", parseList);
		dataID.put("status", "available");
		//System.out.println(dataID)
		Response res = given().contentType("application/json").body(dataID).when()
				.post("https://petstore.swagger.io/v2/pet").then().statusCode(200).log().body().extract().response();

		/*
		 * String jsonString = res.asString();
		 * Assert.assertEquals(jsonString.contains("Record added"), true);
		 */

	}

}
