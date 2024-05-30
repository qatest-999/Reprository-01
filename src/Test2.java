
public class Test2 {
	
	public static void main(String[] args) {
         String str= "Quick Projects";
         System.out.println(str);
         charcount(str);
	}
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
}
