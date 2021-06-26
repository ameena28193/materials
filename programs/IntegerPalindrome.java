import java.util.Scanner;


public class IntegerPalindrome {
	
	public static void main(String []args)
	{
		System.out.println("Enter an integer");
		Scanner scan= new Scanner(System.in);
		int number = scan.nextInt();
		int reverse=0;
	  while(number!=0)
	  {
		  int rem=number%10;
		  reverse=reverse*10+(rem);
		  number=number/10;
	  }
		
		System.out.println(reverse);
	}

}
