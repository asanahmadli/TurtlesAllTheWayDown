public class GCD {


    public static int gcd(int a, int b) {
    int temp = a;
    if(temp==1) return 1;
    if(a%temp==0&&b%temp==0){
        return a;
    }
        return gcd(temp-1 ,b);
    }

}

