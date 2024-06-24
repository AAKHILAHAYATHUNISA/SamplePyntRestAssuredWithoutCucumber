package com.Assesment.runner;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AutomationAPI {

	public static void main(String[] args) {
		Response res;
		// TODO Auto-generated method stub
		res = RestAssured.given().baseUri("https://api.restful-api.dev/objects/ff8081818dbde0af018dc59cc7cb0a49")
				.queryParam("status", "available").when().get();

				System.out.println(res.getBody().asString());

	}

}
