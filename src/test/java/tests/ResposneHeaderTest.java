package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ResposneHeaderTest extends BaseTest {

    @Test
    public void testResponseHeader() {
        Assert.assertEquals(response.getHeader("Content-type"),"application/json; charset=utf-8");
    }
}
