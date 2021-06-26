
public class PrimeNumbers {

	public static void main(String[] args) {
		// Printing prime Numbers less than 100
		//System.out.println("2");
		int count;
		for(int i=3;i<40;i++)
		{
			count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					count++;
					
			}
			if(count==0)
				System.out.println(i);
			
		}

	}

}
