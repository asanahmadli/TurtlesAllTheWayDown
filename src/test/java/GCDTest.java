import org.junit.Assert;
import org.junit.Test;

public class GCDTest {
    @Test
    public void test1(){
        GCD g = new GCD();
        int a = 10;
        int b = 15;
        int expected = 5;
        int actual = g.gcd(a,b);
        Assert.assertEquals(expected,actual);

    }
}
