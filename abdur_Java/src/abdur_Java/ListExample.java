package abdur_Java;
import java12.BubbleSort;
import java12.MergeSort;
import java12.Palindrome;
import java12.QuickSort;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
		/*List<Integer> mp = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		//for(int i = 0; i < 15; i++) {
		//	int a = sc.nextInt();
		//	mp.add(a);
		//}
		//System.out.println(mp);
		int[] a = new int[5];
		for(int i = 0; i < 5; i++) {
			a[i] = (int)(Math.random() * 100);
			System.out.println(a[i]);
		}
		*/
		/*
		int[] a = {6, 5, 8, 100, 9, 3};
		int n = a.length;
		for(int j = 0; j < a.length-1; j++) {
			int l = 0;
			for(int k = 1; k < n; k++) {
				if(a[l] > a[k]) {
					int temp = a[l];
					a[l] = a[k];
					a[k] = temp;
				}
				l += 1;
			}
			n -= 1;
		}
		System.out.println("Sorted : ");
		for(int ab : a) {
			System.out.println(ab);
		}
		*/
		/*
		QuickSort obj = new QuickSort();
		int a[] = {10, 16, 8, 6, 5};
		int h = a.length;
		obj.quicSort(a, 0, h-1);
		
		for(int i : a) {
			System.out.print(i + " ");
		}
		*/
		/*
		MergeSort obj = new MergeSort();
		int a[] = {10, 16, 8, 6, 5};
		obj.sortValues(a);
		for(int i : a) {
			System.out.print(i + " ");
		}
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N value : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n; j++) {
				count += 1;
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		/*
		int[] a = {1, 2, 3, 4, 5};
		int search = 2, n = a.length;
		for(int i = 0; i < n; i++) {
			if(a[i] == search) {
				System.out.println("Number found at index " +i);
			}
		}*/
		
		/*
		int len = a.length, count = 0;
		for(int i = 0; i < a.length-1; i++) {
			//count += 1;
			int temp = 0;
			for(int j = 1; j < len; j++) {
				count += 1;
				if(a[temp] > a[j]) {
					int c = a[temp];
					a[temp] = a[j];
					a[j] = c;
				}
				temp += 1;
			}
			len -= 1;
		}
		System.out.println(count);
		*/
		
//		long startTime = System.currentTimeMillis();
//		Palindrome obj = new Palindrome();
//		String str = "man";
//		boolean status = obj.checkPalindrome(str);
//		if(status) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not Palindrome");
//		}
//		
//		int inp = 151;
//		boolean status1 = obj.checkPalindrome(inp);
//		if(status1) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not Palindrome");
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.print("Total time taken(in ms) : " + (endTime - startTime));
		
		/*
		int n = 4;int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				count += 1;
			}
		}
		System.out.println(count);
		*/
	}
}
