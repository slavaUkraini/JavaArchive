/**
	 * Class Fib
	 * Do not copy, it is my program
	 * @author Vita Krainik
	 * @version 2.0 since 4.10.2012
	 */
public class Fib {

	int i;
	
	/*Виведення перших n чисел Фібоначі*/
	public void fibbon(int n){
		int a0 = 0;
		int a1 = 1;
		for (i = 0; i < n; i++){
			if (i == 0|| i == 1){
				System.out.print(" " + i);
			}
			else {
				int an = a0 + a1;
				a0 = a1;
				a1 = an;
				System.out.print(" " + an);
			}
		}
	}
	
}
