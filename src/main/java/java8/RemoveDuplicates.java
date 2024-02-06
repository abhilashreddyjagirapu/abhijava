package java8;
import java.util.*;
import java.util.stream.Collectors;
//Write a program to remove duplicate elements from a list of integers using streams.

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(3);
		l.add(4);
		
		l.stream().distinct().collect(Collectors.toList()).forEach(z->System.out.println(z));
	}
}
