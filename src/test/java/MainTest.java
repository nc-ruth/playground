import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest {

    @Test
    public void testGetHelloWorld() throws Exception {
        Assert.assertEquals(Main.getHelloWorld(),"Hello World");

    }


}