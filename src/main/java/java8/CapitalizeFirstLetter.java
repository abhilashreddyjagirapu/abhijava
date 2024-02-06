package java8;
import java.util.*;
import java.util.stream.Collectors;
public class CapitalizeFirstLetter {
	public static void main(String[] args) {
		

	    String[] stringsArray = {"apple", "banana", "orange", "grape"};

        List<String> capitalizedStrings = Arrays.stream(stringsArray)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println("Capitalized and sorted strings: ");
        capitalizedStrings.forEach(System.out::println);

	 

	
	
}
}
