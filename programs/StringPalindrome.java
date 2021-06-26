import java.util.Scanner;


public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a string");
		Scanner scan=new Scanner(System.in);
		String word =scan.nextLine();
		String reverse="";
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse=reverse+word.charAt(i);
		}
               //  System.out.println(reverse);
                 
                 if(word.equalsIgnoreCase(reverse))
                	 System.out.println("Palindrome");
	}
 


}
