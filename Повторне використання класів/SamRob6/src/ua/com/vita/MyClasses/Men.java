package ua.com.vita.MyClasses;

import java.util.Random;

public class Men {
	/**
	 * ���� �������
	 * ���� - ��'�, ��, �������, ��������
	 * @author Vita Krainik
	 * @version 1.0 since 29.11.2012
	 *
	 * @param args
	 */
	public Men(String name, int age, String jobStatus){
		this.name = name;
		this.age = age;
		this.jobStatus = jobStatus;
		//� �������� ���� ����������� ��������
		Random temp = new Random();
		final int t = Math.abs(temp.nextInt(3));
		switch (t){
		case 0: character = "�������"; break;
		case 1: character = "���������"; break;
		case 2: character = "�������"; break;
		default: character = "���������";
		}
		
	}
	
	public void buildHouse(){
		//����� ��������� �������
		House dom = new House("������",1,4);
		System.out.println(dom);
	}
	
	public Men bornSon(String name){
		//����� �������� ����
		//�� �� ����'������ �� ��� ����������� =)
		Men son = new Men(name,1,"����������");
		//this.clone();
		return son;
	}
	
	public void plantTree() {
		//����� �������� ������
		Tree one = new Tree();
		System.out.println(one);
		//one.cutTree();
		//System.out.println(one);
	}
	
	public String toString(){
		return name + "\n³�: " + age + "\n" + jobStatus + "\n�����������: " + character;
	}
	
	protected int age = 25;
	protected String jobStatus = "����������";
	protected final String name;	
	private final String character;
		
}
