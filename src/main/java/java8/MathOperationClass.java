package java8;
import java.util.function.BiFunction;
public class MathOperationClass implements MathOperation{
	
	
	public int operate(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int a = 10, b=20;
		BiFunction<Integer, Integer, Integer> f = (aloc,bloc)-> aloc+bloc;
		System.out.print(f.apply(a, b)); 
		
		
	}
}
