import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Unit Number");
        int n = input.nextInt();
        double amt=0;
        if (n <= 200) {
            amt = n*0.80;
        }
        else if (n > 200 && n <= 300) {

            amt = 160 + (n-200)*0.90;
        }
        else if(n > 300){
            amt = 250 + (n-300)*1;
        }
        else{
            System.out.println("Invalid Unit Number");
        }

        double totalAmt = amt + 100;
        if (totalAmt > 300) {
            totalAmt = totalAmt + ((totalAmt*12.36)/100);
        }

        System.out.println("Total Amount: " + totalAmt);
    }
}
