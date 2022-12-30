package linkedList;
import java.util.LinkedList;

public class LinkedListPractice {
       
	public static void main (String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
// some use cases of LL :- 
//		LRU cache
//		Design LinkedHashset and LinkedHashMap.
//		Design browser history. 
//		Design a Text Editor. 
//		Design twitter

		
	        // add elements
		    ll.add("hello world");
		    ll.add("good morning");
		    ll.add("good afternoon");
		    ll.addFirst("good night");
		    
		    System.out.println(ll);
		    
		    // changing elements
		    ll.set(1, "hey");
		    System.out.println(ll);
		    
		    // removing elements
		    
		    ll.remove(1);
		    // removing a non-existing item
		    ll.remove("hello");
		    System.out.println(ll);
		    
	}
	
}
