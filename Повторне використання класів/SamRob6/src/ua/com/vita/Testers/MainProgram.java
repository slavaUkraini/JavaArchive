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
		//final Men one = new Men("����",20,"������� ����������");
		//one.buildHouse();
		//System.out.println(one);
		final  IdealMen ideal = new IdealMen("������", 22, "���������", "�������");
		System.out.println(ideal);
		System.out.println();
		ideal.buildHouse();
		System.out.println();
		ideal.plantTree();
		//���, �� ��?(((( �� �� �������� ������������?
		//IdealMen son = (IdealMen) ideal.bornSon("����");
		System.out.println("\n��� " + ideal.bornSon("����"));
	}

}
