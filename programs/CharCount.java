import java.util.HashMap;


public class CharCount {
	
	public static void main(String[]args)
	{
		String a ="elephant";
		int value;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<a.length();i++)
		{			
			if(map.containsKey(a.charAt(i)))
			{
				value=map.get(a.charAt(i));
				value++;
				map.put(a.charAt(i), value);
			}
			
			else
			{
				map.put(a.charAt(i), 1);
			}
			
		}
		
		System.out.println(map);
		/*for ( Character key : map.keySet()){
            System.out.println("Character : '"+key+"' Count :"+map.get(key));
		}*/
	}

}
