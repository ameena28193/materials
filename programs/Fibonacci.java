

//Fibinocci printng upto 13
public class Fibonacci {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int sum=0;
		for(int i=0;i<20;i++){
		System.out.println(a);
		if(a==13)
			break;
		sum=a+b;
		a=b;
		b=sum;
		}

	}

}
