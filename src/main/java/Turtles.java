package PACKAGE_NAME;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
    public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

}
