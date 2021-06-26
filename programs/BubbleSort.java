import java.util.Arrays;

// Bubble Sort
public class BubbleSort {

	public static void main(String[] args) {
		
		int numbers[]=new int[]{1,15,7,3,6,12,9};	
		BubbleSort obj=new BubbleSort();
		obj.sort(numbers);
	}
	
	
	public void sort(int[] num)
	{
		int temp;
		int n= num.length; //7
		for(int j=0;j<n;j++)
		
		{
		for(int i=0;i<n-j-1;i++)
		{			
			if(num[i]>num[i+1])
			{
				
				temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
			
		}
		}
		System.out.println(Arrays.toString(num));
	}

}
