import java.util.*;

public class PersonalMathFormula {

    public static int Greatestofnum(int n){
        int rav = 0;
        while (n != 0) {
            int rem = n%10;
            rav = rav + rem;
            n/=10;
        }
        return rav;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        int sum1 = Greatestofnum(n1);
        int sum2 = Greatestofnum(n2);
        int max = 0;
        if (sum1 == sum2) {
            max = -1;
        }
        else{
            max = Math.max(sum1, sum2);
        }
        

        System.out.println("Greatest number is : "+max);
    }
}
