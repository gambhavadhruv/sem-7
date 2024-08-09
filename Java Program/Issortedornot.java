public class Issortedornot {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 8, 1, 9, 4};
        Boolean Issorted = false;
        for(int i=0; i<ar.length; i++){
            for(int j=i+1; j<ar.length; j++){
                if (ar[i]>ar[j]) {
                    Issorted = true;
                }
            }
        }
        if (Issorted) {
            System.out.println("Your array is not sorted.....");
        }
        else{
            System.out.println("Your array is sorted.....");
        }
    }
}
