package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Activity2 {
	@Test(priority=1)
	public void postReq() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\MeghaSikarwar\\eclipse-workspace\\FST-MS-RestAssureProj\\user.json");
 
		Response response = given()
			.baseUri("https://petstore.swagger.io/v2/user").header("Content-Type", "application/json").body(fis).when().post(); 
		fis.close();
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("87701"));
	}

	@Test(priority = 2)
	public void getReq() {
		Response response = given().baseUri("https://petstore.swagger.io/v2/user")
				.header("Content-Type", "application/json").when().pathParam("username", "megha123").get("/{username}");

		response.then().body("id", equalTo(87701));
		response.then().body("username", equalTo("megha123"));
	}

	@Test(priority = 3)
	public void delReq() {
		Response response = given().baseUri("https://petstore.swagger.io/v2/user")
				.header("Content-Type", "application/json").when().pathParam("username", "megha123").delete("/{username}");

		response.then().body("message", equalTo("megha123"));
		response.then().body("code", equalTo(200));
	}

}
