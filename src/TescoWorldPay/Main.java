package TescoWorldPay;

class A {
	// Constructor of class A
	public A() {
		System.out.println("I am in A");
	}

	// Method to display class A's message
	void display() {
		System.out.println("A");
	}
}

class B extends A {
	// Constructor of class B
	public B() {
		System.out.println("I am in B");
	}

	// Overriding method to display class B's message
	@Override
	void display() {
		System.out.println("B");
	}
}

public class Main {
	public static void main(String[] args) {
		// Creating an object of class B, but using a reference of class A
		A a = new B();
		// Calling the display method
		a.display();
	}
}
