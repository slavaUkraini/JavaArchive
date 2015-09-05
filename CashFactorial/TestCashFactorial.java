
public class TestCashFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CachFactorial myCash = new CachFactorial(30);
		
		System.out.println(myCash.cashFactorial(5));
		CachFactorial myCash1 = new CachFactorial(30);
		System.out.println(myCash1.cashFactorial(3));
		//System.out.println(myCash1.cashFactorial(15));
		//System.out.println(myCash.cashFactorial(20));
		//System.out.println(myCash.cashFactorial(30));

	}

}
