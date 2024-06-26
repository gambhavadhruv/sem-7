import java.util.*;
public class Medianofarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of a first array : ");
        int n = sc.nextInt();
        System.out.println("Enter size of a second array : ");
        int n1 = sc.nextInt();
        int ar1[] = new int[n];
        int ar2[] = new int[n1];
        int c = n+n1;
        int ar3[] = new int[c];
        //---------------------------------------------------------------
        System.out.println("Enter elements of a first array......");
        for(int i = 0; i < n; i++){
            ar1[i] = sc.nextInt();
        }
        System.out.println("Your first array is......");
        for(int i = 0; i < n; i++){
            System.out.print(ar1[i]+" ");
        }
        System.out.println();
        //----------------------------------------------------------------
        System.out.println("Enter elements of a second array......");
        for(int i = 0; i < n1; i++){
            ar2[i] = sc.nextInt();
        }
        System.out.println("Your second array is......");
        for(int i = 0; i < n1; i++){
            System.out.print(ar2[i]+" ");
        }
        System.out.println();
        //----------------------------------------------------------------
        for (int i = 0; i < n; i++) {
            ar3[i] = ar1[i];
        }

        for (int i = 0; i < n1; i++) {

            ar3[n + i] = ar2[i];
        }
        System.out.println("Combined array is : ");
        for (int i = 0; i < c; i++) {
            System.out.print(ar3[i]+" ");
        }
        System.out.println();
        System.out.println("Sorted array is......");
        for(int i = 0; i < c-1; i++){
            for(int j = 0; j < c-i-1; j++){
                if (ar3[j]>ar3[j+1]) {
                    int temp = ar3[j];
                    ar3[j] = ar3[j+1];
                    ar3[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(ar3[i]+" ");
        }
        System.out.println();
        
        if (c%2==0) {
            int m=c/2;
            float e = ar3[m];
            float q = ar3[m - 1];
            float ans = (e + q) / 2;
            System.out.println("Median is : "+ans);
        }
        else {
            int median = (c-1)/2;
            float ans = ar3[median];
            System.out.println("Median is : "+ans);
        }
    }
}