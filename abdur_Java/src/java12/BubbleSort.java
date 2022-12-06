package java12;
import java.util.List;
import java.util.Collections;

public class BubbleSort {
	public List<Integer> ascendingOrderList(List<Integer> a){
		int n = a.size();
		for(int i = 0; i < a.size()-1; i++) {
			int temp = 0;
			for(int j = 1; j < n; j++) {
				if(a.get(temp) > a.get(j)) {
					Collections.swap(a, temp, j);
				}
				temp += 1;
			}
			n -= 1;
		}
		return a;
	}
	
	public List<Integer> descendingOrderList(List<Integer> a){
		int n = a.size();
		for(int i = 0; i < a.size()-1; i++) {
			int temp = 0;
			for(int j = 1; j < n; j++) {
				if(a.get(temp) < a.get(j)) {
					Collections.swap(a, temp, j);
				}
				temp += 1;
			}
			n -= 1;
		}
		return a;
	}
	
	public int[] ascendingOrderArray(int[] a){
		int n = a.length;
		for(int i = 0; i < a.length-1; i++) {
			int temp = 0;
			for(int j = 1; j < n; j++) {
				if(a[temp] > a[j]) {
					int c = a[temp];
					a[temp] = a[j];
					a[j] = c;
				}
				temp += 1;
			}
			n -= 1;
		}
		return a;
	}
	
	public int[] descendingOrderArray(int[] a){
		int n = a.length;
		for(int i = 0; i < a.length-1; i++) {
			int temp = 0;
			for(int j = 1; j < n; j++) {
				if(a[temp] < a[j]) {
					int c = a[temp];
					a[temp] = a[j];
					a[j] = c;
				}
				temp += 1;
			}
			n -= 1;
		}
		return a;
	}
}
