package Getapcs_Avision.Getapcs_Avision1;

public class Practice {

	public static void main(String[] args) {
		// Creating an object
		MyClass obj1 = new MyClass(42);

		// Creating a reference to the same object
		MyClass obj2 = obj1;

		// Modifying the object through one reference
		obj1.setValue(100);

		// Accessing the object through the other reference
		System.out.println("Value through obj2: " + obj2.getValue()); // Output: Value through obj2: 100
	}
}

class MyClass {
	private int value;

	public MyClass(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
