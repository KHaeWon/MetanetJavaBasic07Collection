import java.util.ArrayList;
import java.util.Stack;

//설계도

class Mygeneric<T>{//T -> Type parameter, 여기에는 원시타입 불가(int -> Integer)
	T obj;
	
	void add(T obj) {
		this.obj=obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Person{
	int age = 100;
}

public class Ex02_Generic {

	public static void main(String[] args) {

		Mygeneric<String> mygen = new Mygeneric<String>();
		//T가 String으로 바뀜
		/*
		String obj;
	
		void add(String obj) {
			this.obj=obj;
		}
		
		String get() {
			return this.obj;
		}
		 */
		
		Mygeneric<Person> mygen2 = new Mygeneric();
		mygen2.add(null);//Person 타입만 가능, 타입의 강제
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person());
		Person p = list.get(0);
		
		Stack<Integer> mystack = new Stack<>();
		mystack.push(10);
		mystack.push(10);
		mystack.push(10);
		mystack.push(10);
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		
	}

}
