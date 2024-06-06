import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
	
	public static void main(String[] args) {
         String str= "Geek for Geeks";
         System.out.println(str);
         //charcount(str);
         //charoccurance(str);
         ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
         //removeduplicatearrylist(list);
         //checkPalidrome("Radar");
         //reversewordsprint("Quick Brown fox jump over the lazy dog");
         //printlastalpbht("Quick Brown fox jump over the lazy dog");
         removeduplicate("geeksforgeeks");
         
	}
	// Print no of character in a String
	public static void charcount(String str1) {
		
		char[] ch= str1.toCharArray();
        for(int i=0; i< ch.length; i++) {
        	String s="";
       while (i<ch.length && ch [i]!=' ') {
    	   s=s+ch[i];
    	   i++;
       }
       System.out.println(s + " Leangth--> "+s.length());
	}
  }
  // Print occurrence of character in a String
	public static void charoccurance(String str2) {
		char[] chararr = str2.toCharArray();
		Map<Character, Integer> map1= new HashMap<Character, Integer>();
		
		for(char c: chararr) {
			if(c !=' ') {
			if(map1.containsKey(c) ) {
				map1.put(c, map1.get(c)+1);
			}
			else
				map1.put(c, 1);
		 }
		}
		for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
			System.out.println(entry.getKey()+" --> "+entry.getValue());
		}
	}
	// Remove duplicate elements from Array list
	public static <T> void removeduplicatearrylist(ArrayList<T> list) {
		ArrayList<T> newlist = new ArrayList<T>();
		System.out.println("List Before removing duplicate: "+list);
		for(T element:list) {
			if(!newlist.contains(element)) {
				newlist.add(element);
			}
		}
		System.out.println("ArrayList without Duplicates: "+newlist);
	}
	//Check a string palindorme or not
	public static void checkPalidrome(String s) {

		String str ="";
		for(int i=0; i<s.length(); i++) {
			str=s.charAt(i)+str;
		}
		if(s.equalsIgnoreCase(str)) {
			System.out.println("The String is Palindrome");
		}
		else
			System.out.println("The String is NOT Palindrome");
	}
	//Print a sentence in a reverse words order (I Like Java --> Java Like I)
	public static void reversewordsprint(String s) {
		
		String str="";
		for(String s2: s.split(" ")) {
			str=s2+" "+str;
		}
		System.out.println(str);
	}
	//Print last alphabet in every word of a string
	public static void printlastalpbht(String s) {
		
		for(String s1 : s.split(" ") ) {
			int lenght=s1.length();
			System.out.println(s1.charAt(lenght-1));
		}
	}
	//Remove duplicate from a String
	public static void removeduplicate(String s) {
		char[] carr= s.toCharArray();
		String s1="";
		Map<Character, Integer> duplicate = new HashMap<Character, Integer>();
		for(int i=0; i<carr.length; i++) {
			if(!duplicate.containsKey(carr[i])) {
				s1=s1+carr[i];
				duplicate.put(carr[i], 1);
			}
		}
		System.out.println(s1);
	}
}
