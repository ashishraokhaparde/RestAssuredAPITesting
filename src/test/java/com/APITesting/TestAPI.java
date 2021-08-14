package com.APITesting;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.XmlConfig;
import java.util.concurrent.TimeUnit;
import org.hamcrest.Matcher;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.matcher.ResponseAwareMatcherComposer.*;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.mapper.ObjectMapperType;
import static io.restassured.path.json.JsonPath.*;
import io.restassured.path.json.JsonPath;


public class TestAPI {

	@Test
	public void ResponseCode() {
		given().get("https://jsonplaceholder.typicode.com/users").then().rootPath("address[0]").body("street", is("Kulas Light")).
		body("city", is("Gwenborough")).detachRootPath("address[0]").body("name[0]", is("Leanne Graham"));
	}
	
}
