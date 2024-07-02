// public class Arraysnum {
//     public static void main(String[] args){
//         int[] ar = {5, 9, 2, 4, 1, 6};
//         int min = ar[0];
//         for(int i=0; i<ar.length-1; i++){
            
//             if (min>ar[i+1]) {
//                 min = ar[i+1];
//             }
            
//         }
//         System.out.println("Minimum number is : "+min);
//     }
// }


//--------------------------------------------------------------------------

// public class Arraysnum {
//     public static void main(String[] args){
//         int[] ar = {5, 9, 2, 4, 1, 6};
//         int max = ar[0];
//         for(int i=0; i<ar.length-1; i++){
            
//             if (max<ar[i+1]) {
//                 max = ar[i+1];
//             }
            
//         }
//         System.out.println("Minimum number is : "+max);
//     }
// }


//-------------------------------------------------------------------------

public class Arraysnum {
    public static void main(String[] args){
        int[] ar = {5, 9, 2, 4, 1, 6};
        double sum=0;
        double avg=0;
        for(int i=0; i<ar.length; i++){
            sum+=ar[i];
            avg = sum/ar.length;
            
            
        }
        System.out.println("Average of an array is : "+avg);
    }
}
