package abdur_Java;

public class ZohoPattern1 {
	public static void main(String[] args) {
		int n = 5;
		int m = (n+1) / 2;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == j) {
					if(i < m) {
						System.out.print(n - i + 1);
					}else {
						System.out.print(i);
					}
				}
				else if(i + j == n + 1){
					if(i < m) {
						System.out.print(i);
					}else {
						System.out.print(j);
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
