package abdur_Java;

import java.util.Scanner;
// Merge two sorted array into single array
public class ZohoArrays2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// getting array range
		int firstArrlen = sc.nextInt();
		int secArrlen = sc.nextInt();
		// initialized two arrays
		int[] firArr = new int[firstArrlen];
		int[] secArr = new int[secArrlen];
		// assigning values to those arrays
		for(int i = 0; i < firstArrlen; i++) {
			firArr[i] = sc.nextInt();
		}
		for(int i = 0; i < secArrlen; i++) {
			secArr[i] = sc.nextInt();
		}
		// created a result array and assigned all values to it in a sorted manner
		int[] resArr = new int[firstArrlen + secArrlen];
		int resI = 0, j, k = 0;
		
		twoloop: // label - used to break out of both loops at the same time
		for(j = 0; j < firstArrlen; j++) {
			for(k = 0; k < secArrlen; k++) {
				if(firArr[j] <= secArr[k]) {
					resArr[resI] = firArr[j];
					resI += 1;
					j += 1;
					k -= 1;
				}else {
					resArr[resI] = secArr[k];
					resI += 1;
				}
				if(k >= (secArrlen-1) || j >= firstArrlen) {
					break twoloop;
				}
			}
			// if you don't want to use the label, uncomment this 'if' statement
//			if(k >= (secArrlen-1) || j >= firstArrlen) {
//				break;
//			}
		}
		// This condition is for assigning the remaining values in the first array to the result array
		if(j < firstArrlen) {
			for(int i = j; i > (secArrlen-2); i++) {
				resArr[resI] = firArr[i];
				resI += 1;
				if(i >= (firstArrlen-1)) {
					break;
				}
			}
		}
		// This condition is for assigning the remaining values in the second array to the result array
		if(k < secArrlen) {
			for(int l = k+1; l < secArrlen; l++) {
				resArr[resI] = secArr[l];
				resI += 1;
				if(l >= (secArrlen-1)) {
					break;
				}
			}
		}
		for(int J : resArr) {
			System.out.print(J + " ");
		}
	}
}
