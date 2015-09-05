package ua.com.vita.MyClasses;

class House {
	/**
	 * Клас будинок
	 * поля - матеріал, кількість дверей, 
	 * кількість вікон, вік будинку
	 * @author Vita Krainik
	 * @version 1.0 since 29.11.2012
	 *
	 * @param args
	 */
//public void buildHouse(){
	//чи можна було якось тут викликати конструктор?
	//new House("Панель",1,4);
//}

public void becomeOlder(){
	age +=50;
}
public  String toString(){
	return " Об'єкт - будинок\n Матеріал - " + material + 
			"\n Кількість дверей - " + doorsNumber + 
			"\n Кількість вікон - " + windowsNumber +
			"\n Вік - " + age;
}

public House(String material, int doorsNumber, 
		int windowsNumber){
	System.out.println("Збудували будинок");
	this.material = material;
	this.doorsNumber = doorsNumber;
	this.windowsNumber = windowsNumber;
}
private final String material;
private int doorsNumber = 1;
private int windowsNumber = 2;
private int age = 1;

}
