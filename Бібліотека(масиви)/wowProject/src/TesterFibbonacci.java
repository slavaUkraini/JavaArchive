import ua.com.vita.krainik.firstPackage.Fibonacci;
public class TesterFibbonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fibonacci test = new Fibonacci(0,1);
		System.out.print("Fib 1 = ");
		test.showLine(1);
		System.out.print("Fib 2 = ");
		test.showLine(2);
		System.out.println("Fib 3 = ");
		test.showLine(3);
		System.out.println("Fib 7 = ");
		test.showLine(7);
		System.out.print("Fib 3 = ");
		test.showLine(3);
		System.out.println("Fib 8 = ");
		test.showLine(8);
		System.out.println("Fib 4 = ");
		test.showLine(4);
	}

}
