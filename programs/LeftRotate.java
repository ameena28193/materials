import java.util.Arrays;


public class LeftRotate {

	public static void main(String[] args) {

       int []a =new int[]{1,2,3,4,5};
       int x=a[0];
       
       for(int i=0;i<a.length-1;i++)
       {
    	   a[i]=a[i+1];
       }
       a[a.length-1]=x;
       
       System.out.println(Arrays.toString(a));

	}

}
