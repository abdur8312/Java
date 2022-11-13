package abdur_Java;

public class ButterflyShuffle {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,0};
		int n = a.length / 2;
		for(int i = n-1; i < n; i--) {
			System.out.println(a[i]);
			if(i == 0) {
				break;
			}
		}
		int n1 = a.length;
		for(int j = n1-1; j >= n; j--) {
			System.out.println(a[j]);
		}
	}
}
