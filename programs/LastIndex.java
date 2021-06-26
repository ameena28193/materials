// Find the last index of a charactor in a string.
public class LastIndex {

	public static void main(String[] args) {
		
		String a ="inception";
		
		//System.out.println(a.lastIndexOf("i"));
		int index=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='i')
			{
				
				index=i;
			}
			
		}
		System.out.println(index);

	}

}
