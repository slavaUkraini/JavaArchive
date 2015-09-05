import java.io.IOException;
/**
 * Class Fizz
 * Do not copy, it is my program
 * @author Vita Krainik
 * @version 2.0 since 4.10.2012
 */
public class Fizz {
	//int[] mass;
	int mass;
	/*Ðואכ³חאצ³ÿ דנט fizzbuzz*/
	public void fizzbuzz (int n) throws IOException {
		//mass = new int[n];
		//createmass(n);
		for(int i = 1; i<=n; i++){
			if (i==35*(i / 35)){
				System.out.print(" fizzbuzz");
			}
			else if (i==7*(i/5)){
				System.out.print(" buzz");
			}
			else if (i==5*(i/5)){
				System.out.print(" fizz");
			}
			else {System.out.print(" " + i);}
		}
	}
}
