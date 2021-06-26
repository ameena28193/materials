import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int fact=1;
		while(number!=0)
		{
			fact=fact*number;
			number=number-1;
		}
            System.out.println(fact);
	}

}
