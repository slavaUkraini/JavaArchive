import java.math.BigInteger;
/**
 * Class FactCache
 * Do not copy, it is my program
 * @author Vita Krainik
 * @version 2.0 since 4.10.2012
 */

public class FactCache {
	static BigInteger[] factorValue = new BigInteger[21];//���� �����?
	
	/*����������� ��������� ������ ����� �� ��������� ���������*/
	public BigInteger fcache(int n){
		BigInteger rez = null;
		if(n == 0){
			factorValue[n]=BigInteger.ONE;
			rez = factorValue[n];
		}
		else if (n > 0 && n < 21) {
			factorValue[n]=BigInteger.valueOf(n).multiply(fcache(n-1));
			rez = factorValue[n];
		}
		else {
			System.out.println("������������ n! ");
		}
		return rez;
	}
}
