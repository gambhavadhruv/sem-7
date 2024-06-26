import java.util.*;
public class Pizzaparty{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of pizza : ");
		int inp1 = sc.nextInt();
		System.out.println("Enter number of persons : ");
		int inp2 = sc.nextInt();
		int ans=0;
		for (int i=inp2;i<=inp1 ;i++ ) {
			if (inp1%i==0) {
				ans=i;
				break;
			}
		
		}
		
		int sum=0;
		while(ans>0){
			int rem=ans%10;
			sum=sum+rem;
			ans=ans/10;
		}
		System.out.println("Output is : "+sum);
	}
}