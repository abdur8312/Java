package abdur_Java;
import java12.ArmstrongNumber;
import java.lang.Exception;
import java12.BubbleSort;
import java.util.List;
import java.util.ArrayList;

class A{
	A(){
		System.out.println("first");
	}
	A(String a){
		System.out.println(a + "second");
	}
	A(float a){
		System.out.println(a + "third");
	}
	void print() throws Exception {
		throw new Exception();
	}
}
	


public class SuperClass {
	static int b;
	public static void main(String[] args) throws Exception {
		/*
		ArmstrongNumber obj = new ArmstrongNumber();
		Class cl = obj.getClass().getSuperclass();
		System.out.println(cl);
		//System.exit(1);
		
		
		Class c1 = obj1.getClass().getSuperclass();
		System.out.println(c1);
		obj1.print();
		*/
		
		int a = 2, b = 0;
		try {
			int c = a / b;
		}catch(Exception e) {
			System.out.println("catched");
		}finally {
			int c = a / b;
		}
		System.out.println("done");
	}
}
