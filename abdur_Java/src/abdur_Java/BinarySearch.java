package abdur_Java;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int list[] = {0,1,2,3,4,5,6,7,8,9,10};
		int l = 0;
		int h = list.length;
		System.out.print("Enter the number you want to search : ");
		int key = sc.nextInt();
		while(l <= h) {
			int mid = (l + h) / 2;
			if(list[mid] == key) {
				System.out.println("Value is in index : " + mid);
				break;
			}else if(key < list[mid]) {
				h = mid - 1;
			}else if(key > list[mid]) {
				l = mid + 1;
			}
		}
	}
}
