import java.math.BigInteger;
import java.util.Scanner;

public class TrailingZero{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        System.out.println("Answer "+trailingZeroCount(input.nextInt()));
    }

    public static int trailingZeroCount(int num){
        BigInteger fac = factorial(num);
        int rem = 0;
        int count = -1;
        while (rem == 0 && fac.compareTo(BigInteger.ZERO) > 0) {
            rem = fac.remainder(BigInteger.TEN).intValue();
            fac = fac.divide(BigInteger.TEN);
            count++;
        }
        return count;
    }

    public static BigInteger factorial(int num){
        BigInteger fac = BigInteger.ONE;
        for(int i=1;i<=num;i++){
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }
}