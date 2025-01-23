package activities;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Activity1 {
	@Test(priority=1)
	public void postReq() {
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("id", 77232);
		reqBody.put("name", "Riley");
		reqBody.put("status", "alive");
 
		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/pet").header("Content-Type", "application/json").body(reqBody).when().post(); 
 
		response.then().body("id", equalTo(77232));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
	}
	@Test(priority=2)
	public void getReq() {
		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/pet").header("Content-Type", "application/json").when()
			.pathParam("petId",77232).get("/{petId}"); 
 
		response.then().body("id", equalTo(77232));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
	}
	@Test(priority=3)
	public void delReq() {
		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/pet").header("Content-Type", "application/json").when()
			.pathParam("petId",77232).delete("/{petId}"); 
 
		response.then().body("message", equalTo("77232"));
		response.then().body("code", equalTo(200));
	}
}
