
// Finding the missing number in an array of integers.
/*code by flutterfly */
public class MissingNumber {

	// Function to find the missing number
	public static int findMissingNumbers(int[] arr, int n) {
		int XOR = 0;
		
		// XORing [1..n] with the elements present in the array
		// cancels the identical numbers. So at the end, we will
		// get the missing number.
		for (int i = 0; i < n - 1; i++) {
			XOR ^= arr[i];
		}
		for (int i = 1; i < n + 1; i++) {
			XOR ^= i;
		}
		return XOR;
	}

	// Driver code
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
		int n = 22;
		System.out.println(findMissingNumbers(arr, n));
	}
}
