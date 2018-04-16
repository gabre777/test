
public class Search {
	public static int linear(int[] arr, int number) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			if(number == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binary(int[] arr, int a, int b, int value) {
		int c = (a + b) / 2;
		if(value < arr[c]) {
			return binary(arr, a, c, value);
		}else if(value > arr[c]){
			return binary(arr, c, b, value);
		}else {
			return c;
		}
	}
}
