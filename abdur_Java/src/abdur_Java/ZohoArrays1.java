package abdur_Java;

import java.util.ArrayList;
import java12.*;
import java.util.List;
import java.util.Scanner;

public class ZohoArrays1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 9;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] % 2 == 0) {
				even.add(arr[j]);
			}else {
				odd.add(arr[j]);
			}
		}
		BubbleSort obj = new BubbleSort();
		odd = obj.ascendingOrderList(odd);
		even = obj.descendingOrderList(even);
		System.out.println("Odd List : " + odd);
		System.out.println("Even List : " + even);
		System.out.print("Output : ");
		for(int i = 0, j = 0; i < odd.size() && j < even.size(); i++, j++) {
			System.out.print(odd.get(i) + " " + even.get(j) + " ");
		}
		System.out.println(odd.get(odd.size()-1));
	}
}
