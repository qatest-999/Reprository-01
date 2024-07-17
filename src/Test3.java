import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		int []arra= {1,2,3,4,5,6};
		find2ndhigestarray(arra);
		printduplicate("geek for geeks");
		findindexsum1(arra,3);
		findindexsum2(arra,8);

	}
	
	public static void find2ndhigestarray(int arr[]) {
		
	Arrays.sort(arr);
	System.out.println(arr[arr.length-2]);
	}
    //Print only duplicate character in a String
	public static void printduplicate(String s) {
		char []charrarry= s.toCharArray();
		Map<Character, Integer> duplicate = new HashMap<Character, Integer>();
		for (char c: charrarry) {
			if(c!=' ') {
				if(duplicate.containsKey(c)) {
					duplicate.put(c, duplicate.get(c)+1);
				}
				else
					duplicate.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : duplicate.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
	//Print Indices of 2 consecutive number which equal to a sum
	public static void findindexsum1(int arr[], int sum) {
		int total=0;
		for(int i=0; i<arr.length;i++) {
			total=arr[i]+arr[i+1];
			if(total==sum) {
				System.out.println("Index of 1st element: "+i);
				System.out.println("Index of 2nd element:" +i+1);
				break;
			}
		}
	}
	//Print Indices of 2 number which equal to a sum
	public static void findindexsum2(int arr[], int sum) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				total=arr[i]+arr[j];
				if(total==sum) {
					System.out.println("For Iteration : "+(i+1)+" Index are: "+i+" "+j);
					System.out.println();
					break;
				}
			}
		}
	}
}
