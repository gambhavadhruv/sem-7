public class HammingDistance {
    public static void main(String[] args) {
        hammingDistance(9, 14);
    }
    
    public static void hammingDistance(int n1,int n2) {
        int x = n1 ^ n2;
        int setBits = 0;
        System.out.println("x "+x);
        while (x > 0) 
        {
            System.out.println("x & 1 "+(x & 1));
            setBits += x & 1;
            x >>= 1;
            System.out.println("x "+x+" setbits "+setBits);
        }
     
        System.out.println(setBits);
    }
}