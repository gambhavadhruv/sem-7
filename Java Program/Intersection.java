import java.util.*;
public class Intersection{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st array : ");
        int n1 = sc.nextInt();
        int[] ar1 = new int[n1];
        System.out.println("Enter elements of 1st array : ");
        for(int i=0; i<n1; i++){
            ar1[i] = sc.nextInt();
        }
        System.out.println("Elements of 1st array : ");
        for(int i=0; i<n1; i++){
            System.out.println(ar1[i]);
        }
        System.out.println("Enter size of 2nd array : ");
        int n2 = sc.nextInt();
        int[] ar2 = new int[n2];
        System.out.println("Enter elements of 2nd array : ");
        for(int i=0; i<n2; i++){
            ar2[i] = sc.nextInt();
        }
        System.out.println("Elements of 2nd array : ");
        for(int i=0; i<n2; i++){
            System.out.println(ar2[i]);
        }
        int[] temp = new int[n1];
        System.out.println("Intersection of an array : ");
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if (ar1[i] == ar2[j]) {
                    temp[i] = ar1[i];
                }
            }
            System.out.println(temp[i]);
        }
    }
}