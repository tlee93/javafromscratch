public class j02{
	public static void main(String[] args){
		System.out.println("Primitive data types:");

		byte b = 123;  // byte
		System.out.println("Value of byte b: " + b);

		short s = -20;  // short int
		System.out.println("Value of short s: " + s);

		int i1 = 1234567;  // int
		System.out.println("Value of int i1: " + i1);

		int i2 = 0x1234;  // assign hex value
		System.out.println("Value of int i2: " + i2);

		int i3 = 0b010101;  // assign binary value
		System.out.println("Value of int i3: " + i3);

		int i4 = 01234;  // assign octal value
		System.out.println("Value of int i4: " + i4);

		long l1 = 999999;  // long int
		System.out.println("Value of long l1: " + l1);

		long l2 = 999999999L;  // long int with large values require L suffix
		System.out.println("Value of long l2: " + l2);

		long l3 = 999_999_999_999L;  // underscores improve readability
		System.out.println("Value of long l3: " + l3);

		float f = 0.0f;  // floats requires f suffix (default value for floating point literal is double)
		System.out.println("Value of float f: " + f);

		double d1 = 1.23;  // double
		System.out.println("Value of double d1: " + d1);

		double d2 = -1.23d;  // d suffix is optional
		System.out.println("Value of double d2: " + d2);

		double d3 = 5e10;  // assign using scientific notation
		System.out.println("Value of double d3: " + d3);

		char c1 = 'a';  // chars use single quotes for char literals
		System.out.println("Value of char c1: " + c1);

		char c2 = '\uabcd';  // assign using unicode value
		System.out.println("Value of char c2: " + c2);
	}
}