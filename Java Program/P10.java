import java.util.*;
public class P10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row ");
		int n = sc.nextInt();
		for (int i=1;i<=n ;i++ ) {
			for (int j=1;j<=n ;j++ ) {
				if (i==1 || j==1 || i==n || j==n) {
					System.out.print("#");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}
}