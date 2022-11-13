package abdur_Java;

interface ABD{
	int a = 5; //public, static, final by default
	public void print(); //public and abstract by default
	private void display() { //private method
		System.out.println("accessed private method inside interface");
	}
	public static void jump() { //static method
		System.out.println("jumping");
		run(); //calling private static method
	}
	private static void run() { //private static method
		System.out.println("running");
	}
	public default void accessDisplay() { //default method
		display(); //calling private method
	}
}
class B implements ABD{
	public void print() {
		System.out.println("Hello");
		System.out.println(a);
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		B obj = new B();
		obj.print();
		ABD.jump();
		obj.accessDisplay();
		long eTime = System.currentTimeMillis();
		System.out.print("Time taken : " + (eTime - sTime) + "ms");
	}
}
