package abdur_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AB<T>{
	T input;
	
	AB(T input){
		this.input = input;
		System.out.println(input);
	}
	void assign(T a) {
		System.out.println(a);
	}
	
	
}
class ABC{
	int i;
	ABC(int i){
		this.i = i;
	}
	
}


public class GenericClass {
	public static void main(String[] args) {
		//ABC obj1 = new ABC(1);
		/*obj1.i = 1;
		obj1.j = "abdur";
		obj1.print();*/
		
		//AB<ABC> obj2 = new AB<ABC>();
		
	}
}
