import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int []arra= {1,2,3,4,5,6};
		find2ndhigestarray(arra);

	}
	
	public static void find2ndhigestarray(int arr[]) {
		
	Arrays.sort(arr);
	System.out.println(arr[arr.length-2]);
	}

}
