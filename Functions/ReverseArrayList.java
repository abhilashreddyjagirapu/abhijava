package Functions;
import java.util.*;
public class ReverseArrayList {
public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(70);
		
		System.out.println(al);
		
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
		
	}
}
