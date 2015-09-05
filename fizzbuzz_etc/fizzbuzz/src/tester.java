import java.io.IOException;
public class tester {

	private static char c;

	/**
	 * The main program
	 * 
	 * @author Vita Krainik
	 * @version 1.0 since 18.10.2012
	 *
	 * @param args
	 * @param c 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		do{
		System.out.println("Оберіть завдання: ");
		System.out.println("1 - FizzBuzz ");
		System.out.println("2 -  20 перших чисел Фібоначі ");
		System.out.println("3 - Echo і зворотнє Echo ");
		System.out.println("4 - факторіал додатнього цілого та великого цілого");
		System.out.println("5 - факторіал (кешовані результати)");
		int answer = DataInput.getInt();
		switch (answer){
		case 1:
			Fizz test1 = new Fizz();
			test1.fizzbuzz(100);
			break;
		case 2:
			Fib test2 = new Fib();
			test2.fibbon(20);
			break;
		case 3:
			Echo test3 = new Echo();
			System.out.println("Введіть дані: ");
			test3.s = DataInput.getString();
			test3.echo();
			test3.echoBack();
			break;
		case 4:
			Factorial1 test4 = new Factorial1();
			//System.out.println("Введіть n: ");
			System.out.println("n = 0");
			test4.n = 0;
			System.out.println("n! = " + test4.fact());//n max = 16
			//test4.n = DataInput.getInt();
			System.out.println();
			System.out.println("n = 5");
			test4.n = 5;
			System.out.println("n! = " + test4.fact());
			System.out.println();
			System.out.println("n = 20");
			test4.n = 20;
			System.out.println("n! = " + test4.factBig(test4.n));
			break;
		case 5:
			FactCache test5 = new FactCache();
			//System.out.println("Введіть n від 0 до 20: ");
			//int n = DataInput.getInt();
			System.out.println();
			System.out.println("n = 0");
			int n = 0;
			System.out.println("n! = " + test5.fcache(n));
			System.out.println();
			System.out.println("n = 20");
			n = 20;
			System.out.println("n! = " + test5.fcache(n));
			System.out.println();
			System.out.println("n = 23");
			n = 23;
			System.out.println("n! = " + test5.fcache(n));
			System.out.println();
			System.out.println("n = -1");
			n = -1;
			System.out.println("n! = " + test5.fcache(n));
			break;
			default: continue;
		}
		System.out.println();
		System.out.println("Продовжити? y/n");
		c = DataInput.getChar();
		} while (c!='n');//чи можна обійтися без поля?
	}

}
