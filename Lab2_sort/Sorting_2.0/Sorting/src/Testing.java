/*  
 * Version 2.0
 * 
 * 4.10.2012
 */

import java.io.IOException;
public class Testing {

	/**
	 * The main program
	 * 
	 * @author Vita Krainik
	 * @version 2.0 since 4.10.2012
	 */
	public static void main(String[] args) throws IOException {
		
		Arrays myArray = new Arrays();
		System.out.println("¬вед≥ть к≥льк≥сть елемент≥в масиву: ");
		int n = DataInput.getInt();
		
		myArray.main(n); //створюЇмо, сортуЇмо ≥ виводимо масив
		//myArray.createmass(n);
		//myArray.printmass();
		//myArray.sortvybir();
		//myArray.sortvstavka();
		//myArray.sortbulb();
		myArray.randomcreate(n,10);

	}

}
