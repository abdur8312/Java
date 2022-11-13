package java12;

public class ArmstrongNumber {
	public boolean checkArmstrong(String num) {
		int len = num.length();
		int num1 = Integer.valueOf(num);
		int count = 0;
		int temp = num1;
		for(int i = 0; i < len; i++) {
			int res = num1 % 10;
			double pow = Math.pow(res, len);
			count += pow;
			num1 /= 10;
		}
		if(count == temp) {
			return true;
		}else {
			return false;
		}
	}
}
