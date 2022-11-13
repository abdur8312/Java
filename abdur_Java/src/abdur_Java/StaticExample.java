package abdur_Java;

class Static{
	static String a = "rhm";
	static class AB{
		static String method(String b) {
			return b;
		}
	}
	void print() {
		System.out.println("print");
	}
}

public class StaticExample {
	public static void main(String[] args) {
		String res = Static.AB.method("abdur");
		System.out.println(res);
	}
}
