import java.util.*;
public class Dimondpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        //---------lower part
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
