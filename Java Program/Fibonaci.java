import java.util.*;
public class Fibonaci{
    public static void main(String[] args){
        System.out.print("Enter number as you wans to print length of Fibonaci series : ");
        int n1 = 0;
        int n2 = 1;
        int newnum=0;
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println("Series......");
        
        System.out.println(n1);
        System.out.println(n2);
        for(int i=1;i<=n;i++){
            newnum=n1+n2;
            System.out.println(newnum);
            n1=n2;
            n2=newnum;
        }
    }
}