import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        System.out.println("Enter Number");
        int n = input.nextInt();
        int temp = n;
        String ans = (n/2)*2 == temp ? "even" : "odd";
        System.out.println("Number is : " + ans);
    }
}
