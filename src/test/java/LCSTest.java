import org.junit.Assert;
import org.junit.Test;

public class LCSTest {
    @Test
    public void test1(){
        LCS lcs = new LCS();
        String a = "test123te";
        String b = "pest13e";
        String expected = "est13e";
        String actual  = lcs.lcs(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2(){
        LCS lcs = new LCS();
        String a = "123456";
        String b = "12345678";
        String expected = "123456";
        String actual  = lcs.lcs(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test3(){
        LCS lcs = new LCS();
        String a = "123456";
        String b = "123456";
        String expected = "123456";
        String actual  = lcs.lcs(a,b);
        Assert.assertEquals(expected,actual);
    }

}
