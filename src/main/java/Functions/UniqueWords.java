package Functions;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

//Write a Java Program to count the number of unique words in a string using HashMap.
public class UniqueWords {
public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String str = br.readLine();
		String strarr[]=str.split(" ");
		HashMap<String,Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<strarr.length;i++)
		{
			String word = strarr[i];
			if(hm.containsKey(word))
			{
				hm.put(word, hm.get(word)+1);
			}
			else {
				hm.put(word, 1);
			}
		}
		System.out.println(hm);
		for(Entry<String, Integer> mapElement : hm.entrySet())
		{
			if(mapElement.getValue()==1)
			{
				System.out.println(mapElement.getKey());
			}
		}
		
	}
		
	

}
