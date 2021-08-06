package tests;

import io.restassured.response.ResponseBody;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResposneBodyTest extends BaseTest {

    @Test
    public void testRensponseBody() {
        ResponseBody responseBody = response.getBody();
        User[] users = responseBody.as(User[].class);
        Assert.assertEquals(users.length, 10);
    }

}



