package ua.com.vita.Testers;
import ua.com.vita.MyClasses.*;
public class MainProgram {

	/**
	 * The main program
	 * 
	 * @author Vita Krainik
	 * @version 1.0 since 29.11.2012
	 * Do not copy, it is my program.
	 * @param args
	 */
	public static void main(String[] args) throws Throwable {
		//final Men one = new Men("Чарлі",20,"Вчитель математики");
		//one.buildHouse();
		//System.out.println(one);
		final  IdealMen ideal = new IdealMen("Богдан", 22, "Програміст", "Аспірант");
		System.out.println(ideal);
		System.out.println();
		ideal.buildHouse();
		System.out.println();
		ideal.plantTree();
		//ууу, що це?(((( Де моє висхідне перетворення?
		//IdealMen son = (IdealMen) ideal.bornSon("Вася");
		System.out.println("\nСин " + ideal.bornSon("Вася"));
	}

}
