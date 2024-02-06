package java8;
//Implement a method that takes a list of strings and a predicate (using a lambda expression) 
//to filter out strings starting with the letter "A".

import java.util.*;
import java.util.stream.Stream;
public class StartWithA {
public static void main(String[] args) {
		
		String[] stringsArray = {"apple", "banana", "orange", "grape","aA1 star"};
		
		List<String> strlist = Arrays.asList(stringsArray);
		
		strlist.stream().map(x->x.toUpperCase()).filter(i->i.startsWith("A")).forEach(x->System.out.println(x));
		
		
	}
}
