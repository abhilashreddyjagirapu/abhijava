package Functions;
import java.util.*;
public class Swap {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Before Swap:"+a+" "+b);
		a = a-b;
		b= a+b;
		a= b-a;
		
		System.out.println("After Swap: "+a+" "+b);
		
	}
}
