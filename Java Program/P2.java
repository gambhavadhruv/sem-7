import java.util.*;
public class P2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check the number is prime or not : ");
		int n = sc.nextInt();
		int flag=1;
		if (n==0 || n==1) {
			flag=0;
		}
		for (int i=2;i<=n/2 ;i++ ) {
			if (n%i==0) {
				flag=0;
				break;
			}
			
		}

		if (flag==1) {
			System.out.println("Number is prime");
		}
		if (flag==0) {
			System.out.println("Number is not prime");
		}
	}
}