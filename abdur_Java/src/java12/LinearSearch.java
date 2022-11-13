package java12;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
	public List<Integer> getInput(int n){
		Scanner sc = new Scanner(System.in);
		List<Integer> li = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the Number : ");
			int input = sc.nextInt();
			li.add(input);
		}
		return li;
	}
	
	public int getIndex(int element, int n, List<Integer> inp) {
		int i;
		for(i = 0; i < n; i++) {
			if(inp.get(i) == element) {
				break;
			}
		}
		return i;
	}
}
