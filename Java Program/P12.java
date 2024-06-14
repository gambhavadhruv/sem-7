import java.util.*;
public class P12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans1=a%10;
		int ans2=b%10;
		int ans = ans1+ans2;
		System.out.println("sum of last two digits is : "+ans);
	}
}