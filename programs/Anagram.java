import java.util.Arrays;
//Words formed by rearranging the another word

public class Anagram {

	public static void main(String[] args) {
		String a="LISTEN";
		String b="SILENT";
	     new Anagram().isAnagram(a,b);		
		
	}
	
	public void isAnagram(String a, String b)
	{
		a=a.replaceAll("\\s", "").toLowerCase();
		b=b.replaceAll("\\s", "").toLowerCase();
		
	    char[] a1=a.toCharArray();
	    char[] b1=b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
	    
	    
		if(Arrays.equals(a1, b1))
			System.out.println("  anagram");
		else
			{
			System.out.println(" Not an anagram");
			
			
			}
		
	}

}
