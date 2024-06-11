import java.util.*;
public class P6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] ar = {1,2,3,4,5,6,7,8,9};
		int oddsum=0;
		int evensum=0;
		for (int i=0;i<ar.length ;i++ ) {
			if(ar[i]%2==0){
				evensum=evensum+ar[i];
			}
			if(ar[i]%2!=0){
				oddsum=oddsum+ar[i];
			}
		}
		System.out.println("Odd number sum is : "+oddsum);
		System.out.println("Even number sum is : "+evensum);
		

	}
}