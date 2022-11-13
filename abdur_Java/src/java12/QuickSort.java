package java12;

public class QuickSort {
	public static int partition(int[] a,int l,int h) {
		int pivot = a[l];
		int start = l, end = h;
		while(start < end) {
			while(a[start] <= pivot) {
				start += 1;
				if(start > end) {
					break;
				}
			}
			while(a[end] > pivot) {
				end -= 1;
			}
			if(start < end) {
				int b = a[start];
				a[start] = a[end];
				a[end] = b;
			}
		}
		int c = a[l];
		a[l] = a[end];
		a[end] = c;
		return end;
	}
	public void quicSort(int[] a, int l, int h) {
		if(l < h) {
			int j = QuickSort.partition(a, l, h);
			quicSort(a, l, j);
			quicSort(a, j+1, h);
		}
	}
}
