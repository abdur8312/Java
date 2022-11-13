package java12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
	public List<Integer> getInput(int n){
		Scanner sc = new Scanner(System.in);
		List<Integer> li = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			System.out.print("Enter number : ");
			int inp = sc.nextInt();
			li.add(inp);
		}
		return li;
	}
	public int getIndex(List<Integer> li, int n, int inp) {
		int l = 0, h = n-1;
		while(l <= h) {
			int mid = (l + h) / 2;
			if(inp == li.get(mid)) {
				return mid;
			}else if(inp > li.get(mid)) {
				l = mid + 1;
			}else if(inp < li.get(mid)) {
				h = mid - 1;
			}
		}
		return -1;
	}
}
