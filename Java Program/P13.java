import java.util.*;
public class P13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int x = Math.min(a,b);
		int min = Math.min(x,c);
		int z = Math.max(a,b);
		int max = Math.max(z,c);

		int mid=0;
		int n=0;

		System.out.println("In accending order : ");
		System.out.println(min);
		if(a>min && a<max){
			System.out.println(a);
		}
		else if(b>min && b<max){
			System.out.println(a);
		}
		else if(c>min && c<max){
			System.out.println(a);
		}
		
		
		
		System.out.println(max);
	}
}