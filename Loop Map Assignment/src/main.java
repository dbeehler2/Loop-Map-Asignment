import java.util.*;

public class main {
	
	 public static void main(String[] args) {    
		 List<Integer> numbers = new ArrayList<>();
	        
	            System.out.println("Input 5 numbers.");
	            int i,n=0,s=0;
	            int product = 1;
	            int max = Integer.MIN_VALUE;
	            int min = Integer.MAX_VALUE;

	            for (i=0;i<5;i++) {
	            	Scanner in = new Scanner(System.in);
	 		    n = in.nextInt();
	 		    if (n > max) max = n;
	 		    if (n < min) min = n;    
	 		    s +=n;
	 		    product *=n;
	 		   
	            }
	            
	       
	        System.out.println("The sum is :"+s+"");
	        System.out.println("The product is :" + product);
	        System.out.println("The maximum number is: " + max);
	        System.out.println("The minimum number is: " + min);		
	        		
	        
	 }
}


