package Functions;
import java.util.*;

public class CharacterReversal {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		String fin="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(Character.isLowerCase(ch))
			{
				fin = fin+Character.toUpperCase(ch);
			}
			else {
				fin = fin + Character.toLowerCase(ch);
				
			}
			
		}
		
		System.out.println(fin);
		
	}
}
