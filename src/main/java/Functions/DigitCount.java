package Functions;
import java.util.*;
import java.util.Map.Entry;
public class DigitCount {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		while(n>0)
		{
			r=n%10;
			
			if(hm.containsKey(r))
			{
				hm.put(r, hm.get(r)+1);
			}
			else {
				hm.put(r, 1);
			}
			n=n/10;
			
		}
		System.out.println(hm);
		
		for(Entry<Integer, Integer> mapElement : hm.entrySet())
		{
			if(mapElement.getValue()>1)
			{
				System.out.println(mapElement.getKey());
			}
		}
		
		
	}
}
