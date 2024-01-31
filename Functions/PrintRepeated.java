package Functions;
import java.util.*;
import java.util.Map.Entry;
public class PrintRepeated {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character,Integer> hm= new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		for (Entry<Character, Integer> mapElement : hm.entrySet()) {
            Character key = mapElement.getKey();
            int val = mapElement.getValue();
            if(val>1)
            	System.out.println(key);
            
            
		}
		
	}

}
