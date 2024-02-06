package java8;

import java.util.ArrayList;
import java.util.List;
public class SortBasedOnLength {
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("sreekar");
		str.add("setty");
		str.add("somi");
		str.add("Java");
		str.add("Full");
		str.add("Stack");
		str.add("Developer");
		
		str.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).forEach(k->System.out.println(k));
	}
}
