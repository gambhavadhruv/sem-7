import java.util.Scanner;

public class NthDigit{
    public static void main(String[] args) {
        System.out.println("Enter Number");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Answer "+NthDigitInfiniteInteger(input.nextInt()));
    }

    public static int NthDigitInfiniteInteger(int n){

        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
        
    }
}