public class maxSubarray1617 {

	public static void main(String[] args) {
		int arr[] = { 1, -2, 3, -4, 5 };
		int arr2[] = { -100 , 20, 30, 40, -50 };
		int arr3[] = { -60, 10, 20 , -50, 90, 1 };
		System.out.println(maxSub(arr));
		System.out.println(maxSub(arr2));
		System.out.println(maxSub(arr3));
	}

	public static int maxSub(int[] arr) {
		int curr = 0;
		int global = Integer.MIN_VALUE;;
		for (int i = 0; i < arr.length; i ++) {
			curr += arr[i];
			if (curr < 0) curr = 0;
			global = Math.max(global, curr);
		}

		return global;
	}
}
