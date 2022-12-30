package hashMap;

import java.util.Scanner;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars {

//	Given a string s, find the length of the longest substring without repeating characters.
	
	   public static int longSubWithoutRepChars(String text) {
		   
		   if (text.length()==0) return 0;
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        int max=0;
	        for (int i=0, j=0; i<text.length(); ++i){
	            if (map.containsKey(text.charAt(i))){
	                j = Math.max(j,map.get(text.charAt(i))+1);
	            }
	            map.put(text.charAt(i),i);
	            max = Math.max(max,i-j+1);
	        }
	        return max;
	   }
	
	   public static void main(String[] args) {
		   
		   Scanner sc = new Scanner(System.in);
		   
		   int testCase = sc.nextInt();
		   
		   for(int i=0;i<testCase;i++) {
			   
			   String text = sc.next();
			   System.out.println("length of Longest Substring without Repeating Character for String " + text + " is " + longSubWithoutRepChars(text));
		   }
		   
		     sc.close();
	   }
}
