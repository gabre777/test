
public class Array {
	public static void print(int[] arr) {
		
		/*for(int val : arr) {
			System.out.printf("%d  ", val);
		}
		System.out.println();*/
		
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.printf("%d", arr[i]);
			if(i < n - 1) {
				System.out.printf(",");
			}
		}
		System.out.println();
	}
}
