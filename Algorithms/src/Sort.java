
public class Sort {
	
	private static int partition(int[] arr, int a, int b, String mode) {
		boolean order = mode.toLowerCase() == "asc" ? true : false;
		int k = order == true ? 0 : -1;
		int pivot = arr[(a + b) / 2];
		while(a < b) {
			while((arr[a] < pivot + 1 * k) == order) {
				a++;
			}
			while((arr[b] > pivot - 1 * k) == order) {
				b--;
			}
			if(arr[a] == pivot && arr[b] == pivot) {
				a++;
			}else if (a < b){
				swap(arr, a, b);
			}
		}
		return b;
	}
	
	private static void quickSort(int[] arr, int a, int b, String mode) {
		if(a < b) {
			int separator = partition(arr, a, b, mode);
			quickSort(arr, a, separator - 1, mode);
			quickSort(arr, separator + 1, b, mode);
		}
	}
	
	public static void quick(int[] arr, String mode) {
		quickSort(arr, 0, arr.length - 1, mode);
	}
	
	public static void insertion(int[] arr, String mode) {
		boolean order = mode.toLowerCase() == "asc" ? true : false;
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int j = i;
			while(j > 0) {
				if((arr[j-1] > arr[j]) == order) {
					swap(arr, j, j-1);
				}
				j--;
			}
		}
	}
	
	public static void selection(int[] arr, String mode) {
		boolean order = mode.toLowerCase() == "asc";
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			int selected = i;
			for(int j = i+1; j < arr.length; j++) {
				if((arr[selected] > arr[j]) == order) {
					selected = j;
				}
			}
			swap(arr, selected, i);
		}
	}
	
	public static void bubble(int[] arr, String mode) {
		boolean order = mode.toLowerCase() == "asc" ? true : false;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if((arr[j] > arr[j+1]) == order) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;	
	}
}
