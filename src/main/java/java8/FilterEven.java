package java8;
import java.util.*;
import java.util.stream.Collectors;
public class FilterEven {
	public static void main(String[] args) {
		

	    Integer[] IntArray = {1,2,3,4,5,6,7,8,9,10};

         Arrays.stream(IntArray)
        		.filter(i->i%2!=0)
                .map(z->z*2)
                .forEach(v->System.out.println(v));
        
       
	 

	
	
}
}
