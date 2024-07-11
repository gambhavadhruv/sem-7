import java.util.*;
public class Bubble_sort{   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter elements of an array : ");
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("Elements of an array is : ");
        for(int i=0; i<n; i++){
            System.out.println(ar[i]);
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if (ar[j]>ar[j+1]) {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.println(ar[i]);
        }
        sc.close();
    }   
}