import java.util.Random;

public class Util2 {
	
	// Prints an integer array in the format [1, 2, 3]
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i = 0; i <= arr.length; i++) {
			if(i > 0)
				System.out.print(", ");
			System.out.print(arr[i]);
		}
		System.out.println("]");
	}
	
	public static int[] shuffle(int[] arr) {
		Random rng = new Random(System.currentTimeMillis());
		int[] out = new int[arr.length];
		int insertionIndex = 0;
		int countRemaining = arr.length;
		boolean[] used = new boolean[arr.length];
		for(int i = 0; i < arr.length; i++) {
			int selectedIndex = rng.nextInt(countRemaining);
			int nextElementIndex = 0;
			for(int j = 0; j < used.length; j++) {
				if(used[j]) continue;
				if(selectedIndex == 0) {
					nextElementIndex = j;
					break;
				}
				selectedIndex--;
			}
			out[insertionIndex] = arr[nextElementIndex];
			used[nextElementIndex] = true;
			countRemaining--;
			insertionIndex++;
		}
		return arr;
	}
	
	// Checks if n is a prime number 
	public static boolean prime(int n) {
    if (n <= 1)  // 0 and 1 are not prime
        return false;
        
    for (int i = 2; i <= Math.sqrt(n); i++) {  // Only check up to sqrt(n)
        if (n % i == 0)
            return false; // Divisible by something other than 1 and itself
    }
    return true; // No divisors found, it's prime
}

	
	public static String arrayMaxMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		return "Max is " + max + ", Min is " + min;
	}
	
}
