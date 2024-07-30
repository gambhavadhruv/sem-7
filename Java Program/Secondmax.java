public class Secondmax {
    public static void main(String[] args){
        int[] ar = {23, 2, 23, 5, 10, 11, 8, 18};
        int max = ar[0];
        int prev = ar[1];
        
        for(int i=1; i<ar.length; i++){
            if (ar[i] > max) {
                prev = max;
                max = ar[i];
            }
            
            else if(ar[i] > prev && ar[i] != max){
                prev = ar[i];
            }
        }
        
            System.out.println("second max is : "+prev);
        
        
    }
}
