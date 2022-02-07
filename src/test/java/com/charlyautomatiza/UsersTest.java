package com.charlyautomatiza;

import org.junit.Before;

import static io.restassured.RestAssured.*;
import org.json.JSONObject;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * API test for sample App.
 */
public class UsersTest
{

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    /**
     * Get all users
     */
    @Test
    public void getAllUsers() {
        given().
        when().
            get("/users").
        then().
            statusCode(200);
    }

    /**
     * Get user by id
     */
    @Test
    public void getUserByIdFixed() {
        given().
        when().
            get("/users/1").
        then().
            statusCode(200);
    }

    /**
     * Get all users then get user by id
     * Is similar as the previous test but with extract sample
     */
    @Test
    public void getUserById() {
        Response response = given().
        when().
            get("/users").
        then().
            statusCode(200)
            .extract()
            .response();

        Integer user_id = response.path("[1].id");

        // log().all() is useful for debug feel free to remove it
        given().log().all().
        when().
            get("/users/{id}", user_id).
        then().
            statusCode(200);
    }

    /**
     * Create user by using a JSON object with fixed values
     */
    @Test
    public void createUser() {
        JSONObject requestParams = new JSONObject();
        JSONObject address = new JSONObject();

        requestParams.put("name", "Test User");
        requestParams.put("username", "testuser");
        requestParams.put("email", "test@user.com");

        address.put("street", "Test Street");
        address.put("suite", "Apt. 123");
        address.put("city", "Electri");
        address.put("zipcode", "54321-6789");

        requestParams.put("address", address);

        given().
            body(requestParams.toString()).
        when().
            post("/users").
        then()
            .assertThat()
            .statusCode(201);
    }
}
