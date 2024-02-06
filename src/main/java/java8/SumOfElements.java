package java8;
import java.util.*;


//Calculate the sum of the squares of all positive integers in a given list using streams.

public class SumOfElements {
	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(8);
		li.add(10);
		int sum=0;
		
		System.out.println(li.stream().mapToInt(n->n*n).sum());
		
		
		
	}

}
