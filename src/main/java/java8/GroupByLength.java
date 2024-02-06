package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class GroupByLength {
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<String>();
		str.add("sreekar");
		str.add("setty");
		str.add("somi");
		str.add("Java");
		str.add("Full");
		str.add("Stack");
		str.add("Developer");
		System.out.println(str);
		
		Map<Integer, List<String>> groupByLength = str.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupByLength);
	}
}
