package stack;

import java.util.Scanner;
import java.util.Stack;

public class Practice {
         
	  public static void main(String[] args) {
		  
		      Stack<Integer> st = new Stack<Integer>();
		      Scanner sc = new Scanner(System.in);
		      
              int numOfElements = sc.nextInt();
              
              for(int i=0;i<numOfElements;i++) {
            	  int x = sc.nextInt();
            	  st.push(x);
              }
              
              System.out.println(st.peek()); // return top element from stack
              
              while(!st.empty()) {        // to check is stack is empty 
            	  System.out.print(st.pop() + " ");    // returns top element and removes it
              }
              
              

	  }
}
