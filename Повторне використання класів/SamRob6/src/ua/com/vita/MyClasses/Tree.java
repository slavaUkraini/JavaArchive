package ua.com.vita.MyClasses;

final class Tree {
	/**
	 * final ���� ������
	 * ���� - ��� ������, �� ������
	 * @author Vita Krainik
	 * @version 1.0 since 29.11.2012
	 *
	 * @param args
	 */

	public Tree(){
		System.out.println("�������� ������");
		this.type = "���";
	}
	public void cutTree(){
		//�� ������ final �����?
		//����� �������� ��'���?
		System.out.println("�� ������ ������, �������!");
	}
	public String toString(){
		return type + " " + age + " ����";
	}
private final String type;
private int age = 10;

}
