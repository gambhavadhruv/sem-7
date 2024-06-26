import java.util.*;
public class Transposemet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int n = sc.nextInt();
        System.out.println("Enter number of colunm : ");
        int m = sc.nextInt();
        System.out.println("Enter Elements of metrix : ");
        int[][] ar = new int [n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your metrix is : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Metrix after transpose : ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ar[j][i]+" ");
            }
            System.out.println();
        }
    }
}
