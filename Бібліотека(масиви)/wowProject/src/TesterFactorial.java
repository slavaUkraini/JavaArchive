import ua.com.vita.krainik.firstPackage.Factorial;

public class TesterFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Factorial test = new Factorial();
		System.out.println("�������� 0 = " + test.cashFactorialTest(0));
		System.out.println("---------------------------");
		System.out.println("�������� 5 = " + test.cashFactorialTest(5));
		System.out.println("---------------------------");
		System.out.println("�������� 3 = " + test.cashFactorialTest(3));
		System.out.println("---------------------------");
		System.out.println("�������� 6 = " + test.cashFactorialTest(6));
		Factorial test2 = new Factorial();
		System.out.println("---------------------------");
		System.out.println("��������� ����� ��'��� � ������ �������� 6");
		System.out.println("�������� 6 = " + test2.cashFactorialTest(6));
		System.out.println("---------------------------");
		System.out.println("�����!");
	}

}
