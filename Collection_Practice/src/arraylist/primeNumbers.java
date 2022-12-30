package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class primeNumbers {
       
	  public static void main(String[] args) {
		  
		  ArrayList<Boolean> isPrime = new ArrayList<>(Collections.nCopies(10000, false));
		  
		  for(int i=2;i<10000;i++) {
			  if(isPrime.get(i)==false) {
	                  for(int j=i*i;j<10000;j+=i) {
	                	  isPrime.set(j, true);
	                  }
			  }
		  }
		  
		  for(int i=2;i<100;i++) {
			  if(isPrime.get(i)==false)System.out.print(i+" ");
		  }
	  }
	  
}
