package arrays;
import java.util.*;

public class reverseArray {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		int rev[] = new int[5];
		int revcount=4;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			rev[revcount]=arr[i];
			revcount--;
			
		}
		System.out.println("Printing reverse array");
		for(int j=0;j<rev.length;j++)
		{
			System.out.print(rev[j]+" ");
		}
		
		
		
		
	}


}
