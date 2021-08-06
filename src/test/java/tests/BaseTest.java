package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected Response response;

    @BeforeTest
    public void initTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        response = RestAssured
                .when()
                .get("/users/")
                .andReturn();
    }


}
