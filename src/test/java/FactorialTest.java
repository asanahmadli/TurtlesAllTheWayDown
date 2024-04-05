import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void test1(){
        Factorial f = new Factorial();
        int n = 5;
        int expected = 120;
        int actual = f.factorial(5);
        Assert.assertEquals(expected,actual);;
    }
}
