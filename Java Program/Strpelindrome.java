import java.util.*;

import javax.sound.sampled.Line;
public class Strpelindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check it is pelindrome or not : ");
        String str = sc.nextLine();
        String rev="";
        int len = str.length();

        for(int i=(len-1); i>=0; i--){
            rev = rev + str.charAt(i);
        }
        
        if (str==rev) {
            System.out.println("Pelindrome.......");
        }
        else{
            System.out.println("Not Pelindrome.......");
        }

    }
}
