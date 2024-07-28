import java.util.*;
public class CalculateIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;
        if (income <= 10000) {
            tax=0;
        }
        if (income > 10000) {
            int taxincome = Math.min(income, 50000) - 10000;
            tax += taxincome*0.10;
        }

        if (income > 50000) {
            int taxincome = Math.min(income, 100000) - 50000;
            tax += taxincome*0.20;
        }
        if (income > 100000) {
            int taxincome = income - 100000;
            tax += taxincome*0.30;
        }
        
        System.out.println(tax);
    }
}
