package abdur_Java;

public class LinearSearch {
	public int strCount(String str, String sub_Str) {
		int n = str.length(), n1 = sub_Str.length();
		int j = n1, count = 0;
		String sub = "";
		for(int k = 0; k < n; k++) {
			for(int i = 0 + k; i < j; i++) {
				char temp = str.charAt(i);
				sub += temp;
			}
			j += 1;
			if(sub_Str.equals(sub)) {
				count += 1;
			}
			sub = "";
			if(j > n) {
				break;
			}
		}
		return count;
	}
	
	public String revStr(String str) {
		int n = str.length();
		String rev_Str = "";
		for(int i = n - 1; i >= 0; i--) {
			char a = str.charAt(i);
			rev_Str += a;
		}
		return rev_Str;
	}
	
	public static void main(String[] args) {
		LinearSearch obj = new LinearSearch();
		String str = "ABADABAD";
		String sub_Str = "BAD";
		System.out.println(str);
		System.out.println(sub_Str);
		int c1 = obj.strCount(str, sub_Str);
		String rev_str = obj.revStr(str);
		int c2 = obj.strCount(rev_str, sub_Str);
		System.out.println("Total count = " +(c1 + c2));
		
	}
}
