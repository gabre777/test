
public class Main {

	public static void main(String[] args) {
		int[] arr = {1,5,7,4,9,4,2,7,4,0,1,9};
		//Sort.quick(arr, "asc");
		Array.print(arr);
		//System.out.printf("%d", Search.linear(arr, 5));
		System.out.printf("%d", Search.binary(arr, 0, arr.length - 1, 5));
	}

}
