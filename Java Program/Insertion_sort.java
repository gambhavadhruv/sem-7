import java.util.*;
public class Insertion_sort{   
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
        for(int i=1; i<n; i++){
            int current = ar[i];
            int j = i - 1;
            while (j>=0 && current < ar[j]) {
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = current;
        }
        System.out.println("Sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.println(ar[i]);
        }
        sc.close();
    }   
}