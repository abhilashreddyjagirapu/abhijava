package java8;
import java.util.*;
//Given an array of Integers, write a program to find the average of squares of all the odd numbers.
public class SquareAverage {

public static void main(String[] args) {
	
	Integer[] ar= {1,2,3,4,5,6,7,8,9,11};
	
	OptionalDouble result = Arrays.stream(ar).filter(a->a%2!=0).mapToDouble(lol->lol*lol).average();
	
	System.out.println(result);
	
}
}
