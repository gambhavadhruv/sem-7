import java.util.*;
public class Rhombuspyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if (j==1 || j==n || i==1 || i==n) {
                    System.out.print("*");   
                }
                else{
                    System.out.print(" ");   
                }
            }
            System.out.println();
        }

        
    }
}