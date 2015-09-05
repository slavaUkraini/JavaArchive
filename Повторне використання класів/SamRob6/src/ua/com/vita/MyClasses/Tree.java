package ua.com.vita.MyClasses;

final class Tree {
	/**
	 * final Клас Дерево
	 * поля - тип дерева, вік дерева
	 * @author Vita Krainik
	 * @version 1.0 since 29.11.2012
	 *
	 * @param args
	 */

	public Tree(){
		System.out.println("Посадили дерево");
		this.type = "Дуб";
	}
	public void cutTree(){
		//що робить final метод?
		//Можна видалити об'єкт?
		System.out.println("Ти зрубав дерево, скотина!");
	}
	public String toString(){
		return type + " " + age + " років";
	}
private final String type;
private int age = 10;

}
