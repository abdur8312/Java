package abdur_Java;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdLargest {
	public List<Integer> bubbleSort(List<Integer> a){
		int n = a.size();
		for(int i = 0; i < n; i++) {
			int temp = 0;
			for(int j = 1; j < n; j++) {
				if(a.get(temp) > a.get(j)) {
					Collections.swap(a, temp, j);
				}
				temp += 1;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of values to enter : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			li.add(i, a);
		}
		ThirdLargest obj = new ThirdLargest();
		List<Integer> res = obj.bubbleSort(li);
		System.out.println(res);
		System.out.print("Enter Nth largest element : ");
		int n1 = sc.nextInt();
		sc.close();
		System.out.println(res.get(n-n1));
		
	}
}
