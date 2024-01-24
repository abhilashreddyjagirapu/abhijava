package Collection;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("abhilash");
		al.add("is a good");
		al.add("Java");
		al.add("Full Stack");
		al.add("Developer");
		
		System.out.println(al);
		Object strarr[]=al.toArray();
		for(int j=0;j<strarr.length;j++)
		{
			System.out.println(strarr[j]);
		}
	}

}
