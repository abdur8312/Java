package abdur_Java;

import java.util.Scanner;

public class ZohoArrays3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] array = new int[input];
		// Taking input in the array
		for(int i = 0; i < input; i++) {
			array[i] = sc.nextInt();
		}
		// Assigning sum of digits of a number in arr2
		int[] arr2 = new int[input];
		int t = 0;
		for(int i = 0; i < input; i++) {
			int temp = array[i];
			while(temp != 0) {
				int r = temp % 10;
				t += r;
				temp /= 10;
			}
			arr2[i] = t;
			t = 0;
		}
		// Sorting the array based on the question
		for(int i = 0; i < input; i++) {
			for(int j = i + 1; j < input; j++) {
				if(arr2[i] == arr2[j]) {
					if(array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
				else if(arr2[i] > arr2[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		// Printing the elements in array
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
}
