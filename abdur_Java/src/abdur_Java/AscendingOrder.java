package abdur_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AscendingOrder {
	public List<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		List<Integer> li = new ArrayList<Integer>();
		System.out.print("Enter array length : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("value of index " + i + " : ");
			int value = sc.nextInt();
			li.add(i, value);
		}
		return li;
	}
	public List<Integer> bubbleSort(List<Integer> li) {
		int n = li.size();
		for(int j = 0; j < n; j++) {
			int temp = 0;
			for(int k = 1; k < n; k++) {
				if(li.get(temp) > li.get(k)) {
					Collections.swap(li, temp, k);
				}
				temp += 1;
			}
		}
		return li;
	}
	
	public static void main(String[] args) {
		AscendingOrder obj = new AscendingOrder();
		List<Integer> li = obj.takeInput();
		System.out.println(li);
		List<Integer> ascending = obj.bubbleSort(li);
		System.out.println("Ascending Order : " + ascending);
		
		List<Integer> descending = obj.bubbleSort(li);
		Collections.reverse(descending);
		System.out.println("Descending Order : " + descending);
		
		System.out.println("Second minimum number : " + ascending.get(0));
		
	}
}
