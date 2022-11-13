package abdur_Java;

class Parent{
	void data() {
		System.out.println("Parent method");
	}
	void print() {
		System.out.println("Parent print method");
	}
}
class Child extends Parent{
	void data1() {
		System.out.println("Child method");
	}
	void data() {
		System.out.println("Child overriden method");
	}
}

public class WrapperClass {
	public static void main(String[] args) {
		Parent p = new Child(); //implicit upcasting
		p.print();
		p.data();
		/*Child c = new Parent();   Type mismatch: cannot convert from
									Parent to Child*/
		Child c = (Child)p; // explicit downcasting
		c.data();
		c.data1();
		c.print();
	}
}
