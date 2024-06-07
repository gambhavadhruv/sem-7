import java.util.*;
public class P1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number : ");
		int c = sc.nextInt();

		int temp=a>b?a:b;
		int ans=c>temp?c:temp;
		System.out.println("Largest number is : "+ans);
	}
}