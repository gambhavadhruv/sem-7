import java.util.*;
public class CountFees {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 12;
        int[] fees = new int[n];
        
        System.out.println("Enter fees of all the standerd : ");

        for(int i=0; i<n; i++){
            fees[i] = sc.nextInt();
        }

        System.out.println("Enter number of standerd : ");
        int numofstd = sc.nextInt();
        int[] stdno = new int[numofstd];
        System.out.println("Enter any "+"standerd to calculate the sum of it : ");
        int sum = 0;
        for(int i=0; i<numofstd; i++){
            stdno[i] = sc.nextInt();
        }
        
        for(int i=0; i<numofstd; i++){
            sum += fees[stdno[i]-1];
        }
        System.out.println("The sum is : "+sum);
    }
}
