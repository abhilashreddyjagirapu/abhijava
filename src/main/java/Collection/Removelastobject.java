package Collection;
import java.util.ArrayList;
public class Removelastobject {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("abhilash");
		al.add("is a good");
		al.add("Java");
		al.add("Full Stack");
		al.add("Developer");
		System.out.println("Before Removal");
		System.out.println(al);
		
		int lastIndex = al.size()-1;
		al.remove(lastIndex);
		System.out.println("After Removal");
		System.out.println(al);
		
		
	}
}
