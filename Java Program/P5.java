import java.util.*;
public class P5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print series 1,3,6,10,15,21,.... ");
		int n = sc.nextInt();
		int ans=0;
		for (int i=1;i<=n ;i++ ) {
			ans=ans+i;
			System.out.print(ans+",");
		}
		

	}
}