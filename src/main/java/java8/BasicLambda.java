package java8;
import java.util.function.BiFunction;
import java.util.function.Function;
public class BasicLambda {
	public int sum(int a,int b)
	{
		return a+b;
		
	}
	
	
	public static void main(String[] args) {
//		BasicLambda obj = new BasicLambda();
		int a =10;
		int b=15;
//		System.out.println(obj.sum(a, b));
//		
		BiFunction<Integer, Integer, Integer> f = (aloc,bloc)-> aloc+bloc;
		
		System.out.print(f.apply(a, b)); 
	}
}
