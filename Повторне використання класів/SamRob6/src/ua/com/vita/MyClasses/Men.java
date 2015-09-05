package ua.com.vita.MyClasses;

import java.util.Random;

public class Men {
	/**
	 * Клас Чоловіків
	 * поля - ім'я, вік, професія, характер
	 * @author Vita Krainik
	 * @version 1.0 since 29.11.2012
	 *
	 * @param args
	 */
	public Men(String name, int age, String jobStatus){
		this.name = name;
		this.age = age;
		this.jobStatus = jobStatus;
		//а характер буде визначатися рандомно
		Random temp = new Random();
		final int t = Math.abs(temp.nextInt(3));
		switch (t){
		case 0: character = "Сангвінік"; break;
		case 1: character = "Флегматик"; break;
		case 2: character = "Холерик"; break;
		default: character = "Меланхолік";
		}
		
	}
	
	public void buildHouse(){
		//метод збудувати будинок
		House dom = new House("Панель",1,4);
		System.out.println(dom);
	}
	
	public Men bornSon(String name){
		//метод народити сина
		//він не обов'язково має сам народжувати =)
		Men son = new Men(name,1,"безробітний");
		//this.clone();
		return son;
	}
	
	public void plantTree() {
		//метод посадити дерево
		Tree one = new Tree();
		System.out.println(one);
		//one.cutTree();
		//System.out.println(one);
	}
	
	public String toString(){
		return name + "\nВік: " + age + "\n" + jobStatus + "\nТемперамент: " + character;
	}
	
	protected int age = 25;
	protected String jobStatus = "Тракторист";
	protected final String name;	
	private final String character;
		
}
