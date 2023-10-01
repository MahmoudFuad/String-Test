import org.testng.Assert;
import org.testng.annotations.Test;

public class stringTest {
    @Test
    public void testCalculateLengthWithNonNullString() {
        String input = "Hello, World!";
        int length = input.length();
        Assert.assertEquals(length, 13);
    }
}
