
public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// First Non Repeating Char

		String a="google";
		int count;
		for(int i=0;i<a.length();i++)
		{
			 count =0;
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
						{
					      count++; 
					      System.out.println(i);
						}
			}
			if(count==0)
			{
				//System.out.println(a.charAt(i));
			}
		}
		
	}

}
