package java12;

import java.util.Arrays;

public class MergeSort {
	public int[] sortValues(int[] myList) {
		int len = myList.length;
		if(len > 1) {
			int mid = len / 2;
			int[] left = Arrays.copyOfRange(myList, 0, mid);
			int[] right = Arrays.copyOfRange(myList, mid, len);
			sortValues(left);
			sortValues(right);
			int i = 0, j = 0, k = 0;
			int lengthL = left.length;
			int lengthR = right.length;
			while(i < lengthL && j < lengthR) {
				if(left[i] <= right[j]) {
					myList[k] = left[i];
					i += 1;
				}else {
					myList[k] = right[j];
					j += 1;
				}
				k += 1;
			}
			while(i < lengthL) {
				myList[k] = left[i];
				i += 1;
				k += 1;
			}
			while(j < lengthR) {
				myList[k] = right[j];
				j += 1;
				k += 1;
			}
		}
		return myList;
	}
}
