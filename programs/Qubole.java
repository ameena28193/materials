import java.util.Arrays;


public class Qubole {

	public static void main(String[] args) {
		double sum=0;
		int count=0;
		int addStrength=0;
		int[] paintKits={5,3,4,1,2};
		
		for(int i=0;i<paintKits.length;i++)
		{
			sum=sum+paintKits[i];
		}
	//	double halfSum=Math.ceil(sum/2);	
		double halfSum=(sum/2);	
        Arrays.sort(paintKits);              
        for (int i=paintKits.length-1;i>=0;i--)
        {
        	count++;
        	addStrength=addStrength+paintKits[i];
        
        	if(addStrength>halfSum){
        		System.out.println(count);
        	      break; 	
        	}
        	
        	
        }     
		
		
	}

}
