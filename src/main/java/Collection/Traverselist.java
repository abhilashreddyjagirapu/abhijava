package Collection;
import java.util.ArrayList;

public class Traverselist {
public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Abhilash");
		al.add("is a good");
		al.add("Java");
		al.add("Full Stack");
		al.add("Developer");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Using Enhanced For Loop");
		
		for(String str:al)
		{
			System.out.println(str);
		}
	}

}
