import java.math.BigInteger;
/**
 * Class Factorial
 * Do not copy, it is my program
 * @author Vita Krainik
 * @version 2.0 since 4.10.2012
 */

/*Обрахування факторіалу для цілих чисел від 0 до 16*/
public class Factorial1 {
	int n;
	public int fact(){
		int res = 1;
		for (int i=1; i<=n; i++){
			res=i*res;
		}
		return res;
	}
	/*Обрахування факторіалу для великих цілих чисел 
	 за допомогою рекурсії*/
	public BigInteger factBig (int n){
		BigInteger rez = BigInteger.ONE;
		 if (n == 0) return rez.multiply(BigInteger.valueOf(1));
		 rez = factBig(n-1).multiply(BigInteger.valueOf(n));//rez.multiply(BigInteger.valueOf(i));
		 return rez;
	}
	
}
