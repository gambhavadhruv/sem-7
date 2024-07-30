import java.util.*;
public class Reverseint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
                int rev = 0,rem;
                if(x > 0){
                    while(x > 0){
                        rem = x % 10;
                        rev = rev*10 + rem;
                        x/=10;
                    }
                    System.out.println(rev);
                }
                if(x < 0){
                    x = x*-1;
                    while(x > 0){
                        rem = x % 10;
                        rev = (rev*10 + rem);
                        x/=10;
                    }
                    System.out.println(rev*-1);
                }
            }
        } 
