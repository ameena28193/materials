import java.util.Scanner;


public class CountVowels {

	public static void main(String []args)
	{
		
		char ch;
		
		int vowelsCount=0;
		System.out.println("Enter a text");
		Scanner scan=new Scanner(System.in);
		String text=scan.nextLine().toLowerCase();
		for(int i=0;i<text.length();i++)
		{
			ch=text.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowelsCount++;
			}
			
		}
		System.out.println(vowelsCount);
	}
	
}
