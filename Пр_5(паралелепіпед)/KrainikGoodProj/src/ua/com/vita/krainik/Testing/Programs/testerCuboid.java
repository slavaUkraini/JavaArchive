package ua.com.vita.krainik.Testing.Programs;

import ua.com.vita.krainik.Pr5.Cuboid;

public class testerCuboid {

	/**
	 * ������������ ��� ������������ �������������
	 * 
	 * @author Vita Krainik
	 * @version 1.0 since 18.11.2012
	 */	
	public static void main(String[] args) {
		Cuboid one = new Cuboid(1,2,3);
		System.out.println(one.toString());
		System.out.println("����� ������ = " + one.basisSquare());
		System.out.println("��'�� = " + one.capacity());
		System.out.println("������ = " + one.heightLength());
	}

}
