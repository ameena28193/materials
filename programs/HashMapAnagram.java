import java.util.ArrayList;
import java.util.HashMap;


public class HashMapAnagram {
	
	public static void main(String args[])
	{
		String a="SILENT";
		String b="LISTEN";
		
		HashMap<Integer, Character> hashA =new HashMap<>();
		HashMap<Integer, Character>hashB=new HashMap<>();
		
		 a=a.replaceAll("\\s", "").toLowerCase();
		 b=b.replaceAll("\\s", "").toLowerCase();
		
		for(int i=0;i<a.length();i++)
		{
			hashA.put(i, a.charAt(i));
		}
		
		
		for(int j=0;j<b.length();j++)
		{
			hashB.put(j, b.charAt(j));
		}
		
		
		System.out.println( new ArrayList<>( hashA.values() ).equals(new ArrayList<>( hashB.values() )) ); 
		
		//System.out.println(hashB.get(0));
		
		/*if(hashA.equals(hashB))
		
			System.out.println("Anagrams");
			else
				System.out.println("Not an Anagram");
		*/
		
	}

}
