package ua.com.vita.MyClasses;

class House {
	/**
	 * ���� �������
	 * ���� - �������, ������� ������, 
	 * ������� ����, �� �������
	 * @author Vita Krainik
	 * @version 1.0 since 29.11.2012
	 *
	 * @param args
	 */
//public void buildHouse(){
	//�� ����� ���� ����� ��� ��������� �����������?
	//new House("������",1,4);
//}

public void becomeOlder(){
	age +=50;
}
public  String toString(){
	return " ��'��� - �������\n ������� - " + material + 
			"\n ʳ������ ������ - " + doorsNumber + 
			"\n ʳ������ ���� - " + windowsNumber +
			"\n ³� - " + age;
}

public House(String material, int doorsNumber, 
		int windowsNumber){
	System.out.println("��������� �������");
	this.material = material;
	this.doorsNumber = doorsNumber;
	this.windowsNumber = windowsNumber;
}
private final String material;
private int doorsNumber = 1;
private int windowsNumber = 2;
private int age = 1;

}
