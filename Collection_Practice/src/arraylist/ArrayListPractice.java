package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListPractice {

	  public static void main(String[] args) {
		  
		  ArrayList<Integer> age = new ArrayList<Integer>();
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("input the number of elements");
		  int n = sc.nextInt();
		  
		  for(int i=0;i<n;i++) {
			  int x = sc.nextInt();
			  age.add(x);
		  }
		  
		  System.out.println("ArrayList before intially" + age);
		  
		  // reverse ArrayList
		  Collections.reverse(age);
		  
		  System.out.println("After reversing" + age);
		  
		  // remove element from ArrayList
		  age.remove(2);   // using index
		  age.remove((Integer)6);  // removing object
		  
		  // sorting array list
		  
		  Collections.sort(age);
		  System.out.println("1 is present in ArrayList at index " + Collections.binarySearch(age, (Integer)9 ));
		  
		  // different ways of iterating through ArrayList
		  
		  // i) using for loop
		  for(int i=0;i<age.size();i++)System.out.print(age.get(i) + " ");
		  System.out.print("\n");
		  
		  // ii) using enhanced for loop
		  for(Integer x: age)System.out.print(x + " ");
		  System.out.print("\n");
		  
		  // iii) using forEach() method
		  age.forEach(x->{System.out.print(x + " ");});
		  System.out.print("\n");
		  
		  // iv) using iterator
		  Iterator<Integer> it = age.iterator();
		  while(it.hasNext()) {
			  System.out.print(it.next() + " ");
		  }
		  System.out.print("\n");
  
		  // update an element
		  age.set(1, 2*age.get(1));
		  System.out.println(age);
		  
	  }
}
