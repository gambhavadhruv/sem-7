import java.util.*;
public class Nto1pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");    
            }
            System.out.println();
        }
    }
}