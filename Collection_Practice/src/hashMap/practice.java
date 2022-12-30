package hashMap;
import java.util.HashMap;
import java.util.Map;

public class practice {
  
	
	 public static void main(String[] args) {
		 
		  HashMap<Integer,String> students = new HashMap<Integer,String>();  // id,name
		  
		  // 3 other constructors :- i)(int capacity)  , ii)(int cap, int loadFactor) , iii)(Map c)
		  
		  students.put(1, "hritik");
		  students.put(2,"abhishek");
		  students.put(3, "Sarvesh");
		  students.put(4, "sanidhya");
		  
		  System.out.println("student with id 3 is " + students.get(3));
		  System.out.println("is Map empty ? -> " + students.isEmpty());
		  
		  
		  // iterating over the map
		  
		  for(Map.Entry<Integer,String> elem : students.entrySet()) {
			  
			  int id = elem.getKey();
			  String name = elem.getValue();
			  System.out.println("student Id is : " + id + " and name is : " + name);
		  }
		  
	 }
}
