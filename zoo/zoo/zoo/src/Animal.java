//import java.io.IOException;

public class Animal {
	
	private String name;//�� ���� ����, ��� ����
	private String type;
	private int health;
	private int food;
	private boolean avail;

	public Animal(String name, String type/*, int health, int food, boolean avail*/){
		//��'�, �� �� �������, ������'�, ����������, � �������� �� ���(���, ����)
		this.name = name;//this ����'�����?
		this.type = type;
		this.health = 100;//health;
		this.food = 100;//food;
		this.avail = true;//avail;
	}
	public String getName(){ // ����� ������� ��'�
		return this.name;
	}
	
	public String getType(){ 
		return this.type;
	}
	
	public int getHealth(){ 
		return this.health;
	}
	
	public int getFood(){ 
		return this.food;
	}
	
	public boolean getAvail(){ 
		return this.avail;
	}
	
	public void goAway() {
		this.avail = false;
		System.out.println(this.name + " ����� �� ���� � ��������.");
	}
	
		
		//public Animal changeGrade(double newgrade){
		//averageGrade=newgrade;
		//return this;
	//}
	
	//public Student becomeOlder(){
		//++age;
		//return this;
	//}

}
