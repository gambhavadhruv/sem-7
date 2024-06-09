import java.util.*;
public class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check number is odd or even : ");
		int n = sc.nextInt();

		int a=(n&1);
		if(a==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");	
		}
		

	}
}