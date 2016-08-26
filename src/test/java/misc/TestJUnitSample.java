package misc;

import org.junit.Assert;
import org.junit.Test;

public class TestJUnitSample {
    String message = "Hello world!";
    JUnitSample sample = new JUnitSample();

    @Test
    public void testSampleMethod() {
        Assert.assertEquals(sample.sampleMethod(), message);
    }
}
