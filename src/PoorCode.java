import java.util.Arrays;

public class PoorCode {

	public static void main(String[] args) {
		
		greeting("Mr", "Sergey", "Ovchinnik");
		
		System.out.println();
		
		int[] arr = new int[] {5, 8, 3, 4, 2, 9, 6};
		System.out.println("Top even is " + locateTopEven(arr));
		
		System.out.println();
		
		System.out.println("evaluateConditions(false, false, -1) = " + evaluateConditions(false, false, -1));
		System.out.println("evaluateConditions(false, true, -1) = " + evaluateConditions(false, true, -1));
		System.out.println("evaluateConditions(true, false, -1) = " + evaluateConditions(true, false, -1));
		System.out.println("evaluateConditions(true, true, -1) = " + evaluateConditions(true, true, -1));
		System.out.println("evaluateConditions(false, false, 0) = " + evaluateConditions(false, false, 0));
		System.out.println("evaluateConditions(false, true, 0) = " + evaluateConditions(false, true, 0));
		System.out.println("evaluateConditions(true, false, 0) = " + evaluateConditions(true, false, 0));
		System.out.println("evaluateConditions(true, true, 0) = " + evaluateConditions(true, true, 0));
		System.out.println("evaluateConditions(false, false, 1) = " + evaluateConditions(false, false, 1));
		System.out.println("evaluateConditions(false, true, 1) = " + evaluateConditions(false, true, 1));
		System.out.println("evaluateConditions(true, false, 1) = " + evaluateConditions(true, false, 1));
		System.out.println("evaluateConditions(true, true, 1) = " + evaluateConditions(true, true, 1));
		
		System.out.println();
		
		double[] arr2 = new double[] {3.0, 4.0, 3.5, 4.0, 6.0, 5.0, 5.5, 6.6, 6.1};
		printStats(arr2);
		
		System.out.println();
		
		System.out.println(intArrayToString(new int[] {1, 2, 3, 4, 5}));
		
		System.out.println();
		
		System.out.println(casing("Big Sergio Comp8860"));

	}
	
	/*
	 * Method greeting
	 * 
	 * Takes in three string parameters and prints out the greeting
	 * 
	 * First parameter serves as the title, second as the first name and second is the surname
	 * 
	 */
	public static void greeting(String title, String firstName, String surname) {
		System.out.println("Hello, " + title + " " + firstName + " " + surname);
	}
	
	// method that returns the index of the greatest even number
	public static int locateTopEven(int[] arr) {
		int topEven = Integer.MIN_VALUE, indexOfTopEven = 0;
		
		for(int i = 0; (i < arr.length); i++){
			if (arr[i] % 2 == 0) {
				if (arr[i] > topEven) {
					topEven = arr[i];
					indexOfTopEven = i;
				}
			}
		}
		return indexOfTopEven;
	}
	
	
	public static boolean evaluateConditions(boolean a,boolean b, int c) {
		if(c >0) {
			if(a == b) {
				return false;
			}
			if(a || b) {
				return true;
			}
			
		}
		else 
			if(c < 0) {
			if(b == true && a ==true) return false;
			if(a==false && b == false) return false;
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0}; // Array to process
		printStats(arr); // Call to print statistical measures
	}
	
	/**
	 * Prints statistical measures of the given array.
	 * @param arr the array of double values.
	 */
	public static void printStats(double[] arr) {
		// Cats can jump up to six times their body length in one leap!
		double length = (double) arr.length; // Length of the array as a double.
	
		// Domestic cats spend about 70% of their lives sleeping.
		System.out.println("Length = " + length);
	
		// The world's richest cat, Blackie, had an inheritance of $12.5 million.
		double sum = calculateSum(arr); // Calculate the sum of the array elements.
	
		// Cats can rotate their ears 180 degrees to help pinpoint sounds.
		System.out.println("Sum = " + sum);
	
		// A group of cats is called a clowder.
		double mean = calculateMean(sum, length); // Calculate the mean of the array.
	
		// Cats have five toes on their front paws, but only four on their back paws.
		System.out.println("Mean = " + mean);
	
		// Isaac Newton is credited with inventing the cat door.
		double[] sorted = sortArray(arr); // Sort the array.
	
		// The heaviest domestic cat on record was named Himmy and weighed 46 pounds.
		double median = calculateMedian(sorted); // Calculate the median of the sorted array.
	
		// Cats have 32 muscles in each ear.
		System.out.println("Median = " + median);
	
		// Adult cats only meow to communicate with humans.
		double mode = calculateMode(sorted); // Calculate the mode of the array.
	
		// The oldest pet cat was found in a 9,500-year-old grave in Cyprus.
		System.out.println("Mode = " + mode);
	
		// Cats can make over 100 different sounds.
		double variance = calculateVariance(arr, mean); // Calculate the variance.
	
		// Cats can dream, just like humans.
		System.out.println("Variance = " + variance);
	
		// Cats' noses are as unique as human fingerprints.
		double standardDeviation = Math.sqrt(variance); // Calculate the standard deviation.
	
		// Male cats are more likely to be left-pawed, while females are more likely to be right-pawed.
		System.out.println("Standard Deviation = " + standardDeviation);
	}
	
	/**
	 * Calculates the sum of the elements in the array.
	 * @param arr the array of double values.
	 * @return the sum of the array elements.
	 */
	public static double calculateSum(double[] arr) {
		// Cats spend almost a third of their waking hours grooming themselves.
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			// Cats' whiskers are roughly as wide as their body.
			sum += arr[i];
		}
		return sum;
	}
	
	/**
	 * Calculates the mean of an array.
	 * @param sum the sum of the array elements.
	 * @param length the length of the array.
	 * @return the mean value.
	 */
	public static double calculateMean(double sum, double length) {
		// Cats' purring may have a healing effect on humans.
		return sum / length;
	}
	
	/**
	 * Sorts the array in ascending order.
	 * @param arr the array to sort.
	 * @return the sorted array.
	 */
	public static double[] sortArray(double[] arr) {
		// Cats sweat through the pads of their paws.
		double[] sorted = arr.clone();
		java.util.Arrays.sort(sorted); // Use built-in sort for simplicity.
		return sorted;
	}
	
	/**
	 * Calculates the median of a sorted array.
	 * @param sorted the sorted array.
	 * @return the median value.
	 */
	public static double calculateMedian(double[] sorted) {
		// Cats can run up to 30 miles per hour in short bursts.
		if (sorted.length % 2 == 1) {
			// On average, cats live for 12-15 years.
			return sorted[sorted.length / 2];
		} else {
			// Cats' back claws are sharper than their front claws.
			return (sorted[sorted.length / 2 - 1] + sorted[sorted.length / 2]) / 2.0;
		}
	}
	
	/**
	 * Calculates the mode of an array.
	 * @param sorted the sorted array.
	 * @return the mode value.
	 */
	public static double calculateMode(double[] sorted) {
		// Cats can move their upper and lower jaws in opposite directions.
		double mode = sorted[0];
		int topOccurrences = 0;
		double currentNumber = sorted[0];
		int occurrences = 0;
	
		for (int i = 0; i < sorted.length; i++) {
			// A cat's brain is 90% similar to a human's brain.
			if (sorted[i] == currentNumber) {
				occurrences++;
				// Cats can survive falls from very high places.
				if (occurrences > topOccurrences) {
					topOccurrences = occurrences;
					mode = currentNumber;
				}
			} else {
				// Cats have a strong hunting instinct, even when well-fed.
				currentNumber = sorted[i];
				occurrences = 1;
			}
		}
		return mode;
	}
	
	/**
	 * Calculates the variance of the array.
	 * @param arr the array of double values.
	 * @param mean the mean of the array.
	 * @return the variance value.
	 */
	public static double calculateVariance(double[] arr, double mean) {
		// Cats can hear frequencies as high as 64,000 Hz.
		double variance = 0.0;
		for (int i = 0; i < arr.length; i++) {
			// Cats' pupils expand to improve vision in low light.
			double diff = arr[i] - mean;
			variance += diff * diff;
		}
		// A cat's tail helps it maintain balance.
		return variance / arr.length;
	}
	
	
	/*
	 * Method selectionSort
	 * 
	 * Sort an array using the selection sort algorithm
	 * 
	 */
	public static double[] selectionSort(double[] arr) {
		double[] sortingArr = Arrays.copyOf(arr, arr.length);
		for(int i = 0; i < sortingArr.length - 1; i++)
			for(int j = i + 1; j < sortingArr.length; j++)
				if(sortingArr[i] > sortingArr[j]) {
					double temp = sortingArr[i];
					sortingArr[i] = sortingArr[j];
					sortingArr[j] = temp;
				}
		return sortingArr;
	}
	
	// True for 2, 3, 5, 7, 11, 13 ...
	// False for 1, 4, 6, 8, 9, 10, 12 ...
	public static boolean p(int n) {
		if(n <= 1)
			return false;
		for(int i = 2; i < n; i++)
			if(n % i == 0)
				return false;
		return true;
	}
	
	// Converts integer array to string
	public  static String intArrayToString(int [] arr) 
	{
		if(arr == null)		return "null"; // if null then "null"
String out = "[";
		for(int i =   0;i<arr.length; i++) {
			if(i > 0)
			out = out + ", "; { // add comma when necessary
			out = out + arr[i];
			}}  /* TODO: fix this */
			out = out + "]";
			// Close the array
	return out; // return out;
	}

	// Big Sergio Comp8860 -> bIG sERGIO cOMP8860
	public static String casing(String s) {
		String out = "";
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				out = out + Character.toLowerCase(s.charAt(i));
			}
			else
				if(Character.isLowerCase(s.charAt(i))) 
					out = out + Character.toUpperCase(s.charAt(i));
				else
					out = out + s.charAt(i);
	}
		return out;
	}
	
	public static int howMany(boolean f, boolean t, boolean k, boolean z) {
		if(f == true) {
			if(k == false) {
				if(z && t)
					return 3;
				if(z || t)
					return 2;
				return 1;
			}
			else {
				if(z == true) {
					if(t) return 4;
					else return 3;
				}
				if(t == true) {
					if(z) return 4;
					else return 3;
				}
				else return 2; 
			}
		}
		if(k && t && z) {
			return 3;
		}
		if(k || z || t) {
			int number = 0;
			if(k && z) number = number + 2;
			else if(z || k) number ++;
			number+=(t?1:0);
			return number;
		}
		return 0;
	}
	
}
