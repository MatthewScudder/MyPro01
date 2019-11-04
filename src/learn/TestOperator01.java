package learn;

public class TestOperator01 {

	public static void main(String[] args) {
		byte a = 1;
		int b = 2;
		long b2 = 3;
//		byte c=a+b;
//		int c2=b2+b;   error

		float f1 = 3.14F;
		float d = b + b2;

//		float d2=f1+6.2  error

		System.out.println(-9 % 5);

		System.out.println("****************");

		int x = 3;
		int y = x++; // after execute y=3. assign value to b first,then increase
		System.out.println("x=" + x + "\ny=" + y);

		x = 3;
		y = ++x; // after execute y=5. x will increment first then assign value to y
		System.out.println("x=" + x + "\ny=" + y);

		System.out.println("*****************");

		int i = 3;
		int j = 4;
		i += j; // equal to i=i+j;
		System.out.println("i=" + i + "\nj=" + j);

		i = 3;
		j = 4;
		i *= j + 3; // equal to i=i*(j+3)
		System.out.println("i=" + i + "\nj=" + j);

	}

}
