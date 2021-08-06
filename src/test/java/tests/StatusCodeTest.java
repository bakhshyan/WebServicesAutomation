package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StatusCodeTest extends BaseTest {

    @Test
    public void testStatusCode() {
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
