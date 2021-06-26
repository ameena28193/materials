import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) {
		// Strong number 153 = 1 + 125+ 27
		
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int num= scan.nextInt();
		int tmp=num;
		int r;
		int sum=0;
		while(tmp!=0)
		{
			r=tmp%10;
			sum=sum+(r*r*r);
			tmp=tmp/10;
		}
		
        if(sum==num)
        	System.out.println("Strong number");
        else
        	System.out.println("Not a strong number");
	}

}
