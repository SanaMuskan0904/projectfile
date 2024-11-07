package APIExercise_2;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class apiautomation {

    @Test
    public void verifyGetRequestStatusCode() {
        // Base URL for the API
        RestAssured.baseURI = "https://reqres.in/api";

        // Send a GET request to /users/2
        int statusCode = RestAssured
            .given()
                .when()
                    .get("/users/2")  // Endpoint to test
                .then()
                    .extract()
                    .statusCode();  // Extract the status code

        // Validate that the status code is 200
        Assert.assertEquals(statusCode, 200, "Status Code is not 200!");
    }
}
