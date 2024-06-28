import java.util.Scanner;

public class BinaryToInteger{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Binary String");
        String str = binaryToInteger(input.next());
        System.out.println("Answer "+str);
    }

    public static String binaryToInteger(String num){
        String[] numparts = num.split("\\.");
        int iPart=0;
        double fpart=0;
        int j=0,k=-1;
        for (int i = numparts[0].length()-1; i >=0 ; i--) {
            iPart += Math.pow(2, j)*Character.getNumericValue(numparts[0].charAt(i));
            j++;
        }
        for (int i = 0; i < numparts[1].length(); i++) {
            fpart += Math.pow(2, k)*Character.getNumericValue(numparts[1].charAt(i));
            k--;
        }
        String ans = Double.toString((double)iPart + fpart);
        return ans;
    }
}