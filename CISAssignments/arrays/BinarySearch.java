package arrays;
import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the size of the array:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println("Element to be found:");
		int x=sc.nextInt();
		BinarySearch bin = new BinarySearch(); 
		int a =0,b=n-1;
		System.out.println(bin.Search(arr,x,a,b));
		
	}
	
	int Search(int arr[],int x,int a,int b)
	{
		int mid = (a+b)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		else if(arr[mid]>x)
		{
			a=0;
			b=mid-1;
			return Search(arr,x,a,b);
		}
		else if(arr[mid]<x)
		{
			a=mid+1;
			b=arr.length-1;
			return Search(arr,x,a,b);
		}
		
		return -1;
		
		
		
	}
}
