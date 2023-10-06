package sangeethjava;

import java.util.HashMap;
import java.util.Map;

public class Stringdup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="sangeeth";
		char[]c=s.toCharArray();
	Map<Character,Integer>hm =new HashMap<Character,Integer>();
		
	
		for(char cf:c)
		{
			if(hm.containsKey(cf))
			{
				hm.put(cf, hm.get(cf)+1);
			}else
			
			{
				hm.put(cf, 1);
			}
			
		}
		
		
		for(Map.Entry<Character,Integer>ma:hm.entrySet())
		{
			System.out.println(ma.getKey()+" values are"+ma.getValue());
		}
		
		
	}

}
