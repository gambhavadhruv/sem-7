import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int lcm = findlcm(num1,num2);

        System.out.println("LCM of two number is : "+lcm);
    }
        public static int findlcm(int num1,int num2){
            int max = Math.max(num1,num2);
            int lcm=max;
            
            while (true) {
                if (lcm%num1==0 && lcm%num2==0) {
                    return lcm;
                }
                lcm+=max;
            }
        }
    
}
