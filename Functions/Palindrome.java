package Functions;
import java.util.*;

//Create a Java program to check if a given number is a palindrome.
//
//Write a Java program to swap the values of two integer variables without using a third variable.
//
//Write a Java Program to calculate the factorial of any given number.
//
//Write a Program to identify and print all repeated characters of a string.
//
//Write a Java Program to count the number of unique words in a string using HashMap.
//
//Write a program to check whether one string is a rotation of another in Java?
//
//Given an input number, find the digits that are repeated more than once.
//
//Write a program to reverse an ArrayList in Java
//
//Write a program to sort elements in a HashMap
//
//Write a Java Program to print the sum of all the items of the array
//
//Write a Java Program to replace lower-case characters with upper-case and vice-versa

public class Palindrome {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		String str = i+"";
		
		StringBuffer sb = new StringBuffer(str);
		String rev= sb.reverse().toString();
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
	}
}
