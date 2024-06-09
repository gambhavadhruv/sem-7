import java.util.*;
public class P3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check number is pelindrome or not : ");
		int n = sc.nextInt();
		int og=n;
		int sum=0;
		while(n>0){
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		System.out.println(sum);
		if (og==sum) {
			System.out.println("pelindrome");
		}
		else{
			System.out.println("not pelindrome");	
		}
	}
}