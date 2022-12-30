package stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	
	  public static void main(String[] args) {
		  
		    Scanner sc = new Scanner(System.in);
		    int numOfElements = sc.nextInt();
		    
		    int[] arr = new int[numOfElements];
		    int[] nextGreaterElem = new int[numOfElements];
		    
		    for(int i=0;i<numOfElements;i++) {
		    	arr[i] = sc.nextInt();
		    }
		    
		    Stack<Integer> st = new Stack<Integer>();
		    
		    for(int i=numOfElements-1 ; i>=0;i--) {
		    	 
		    	if(st.isEmpty()) {
		    		nextGreaterElem[i] = -1;
		    		st.push(arr[i]);
		    	}
		    	else {
		    		
		    		while(!st.isEmpty() && arr[i] >= st.peek()) {
		    			st.pop();
		    		}
		    		
		    		if(st.isEmpty()) {
		    			nextGreaterElem[i] = -1;
		    		}
		    		else nextGreaterElem[i] = st.peek();
		    		
		    		st.push(arr[i]);
		    	}
		    }
		    
		    for(int i=0;i<numOfElements;i++)System.out.print(nextGreaterElem[i] + " ");
		    sc.close();
	  }
}
