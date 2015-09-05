package ua.com.vita.krainik.firstPackage; 
/**
 * Class Array
 * Do not copy, it is my program.
 * @author Vita Krainik
 * @version 4.0 since 11.11.2012
 */
public class Array {
	private int[] mass;
	//private boolean filled;
	
	public Array(){
		this(0);
	}
	public void addEnd(int n) {
		//������ ������� � �����
		Array tempMass = new Array(mass.length+1);
		for (int i = 0; i < mass.length;i++)
			tempMass.mass[i]=mass[i];
		tempMass.mass[tempMass.mass.length-1] = n;
		this.mass = tempMass.mass;//��� ����� �� �� ������� � �����������?
	}
	public void delEnd() {
		//�������� ������� � ����
		if (mass.length != 0){
			delete(mass.length-1);
		}
	}
	public void clear() {
		//"���������" �����, �������� �� ��������
		Array tempMass = new Array(0);
		this.mass = tempMass.mass;
	}
	public void printmass () {
		/*���� �������� ������ �� �����*/
		printmass(mass.length);
	}
	public void sortZrost(){
		//���������� �� ���������� vstavka
		for(int i=0; i<mass.length;i++){
			int copyNumber=mass[i];
			int j = i;
			while (j>0 && copyNumber < mass[j-1]){
			mass[j]=mass[j-1]	;
			j--;
			}
			mass[j]=copyNumber;
		}
		printmass();
	}
	public void sortSpad(){
		//���������� �� ���������
		for(int i=0; i<mass.length;i++){
			int copyNumber=mass[i];
			int j = i;
			while (j>0 && copyNumber > mass[j-1]){
			mass[j]=mass[j-1]	;
			j--;
			}
			mass[j]=copyNumber;
		}
		printmass();
	}
	public int getElement(int number){
		//������� ������� ������� �� �������
		if (number<0||number>=mass.length){
			System.out.println("Error! Wrong number! Enter number from 0 to " + (mass.length-1));
			return -1;
		}
		return mass[number];
		}
	public void findElement(int n){
		//������ ������� �� ���������
		for (int i = 0; i<mass.length; i++){
			if (mass[i] == n){
				System.out.println("Element exist!" );
				return;
			}
		}
			System.out.println("Not found");
		return;
	}

	public int getLength(){
		return this.mass.length;
	}	
	protected void delete(int n) {
		//�������� ������� �� �������
		if(mass.length != 0 && n>=0 && n<mass.length)
		{
		Array tempMass = new Array(mass.length-1);
		for(int i = 0; i<tempMass.mass.length; i++){
			if (i>=n) {
				mass[i]=mass[i+1];
			}
			tempMass.mass[i]=this.mass[i];
		}
		this.clear();
		this.mass = tempMass.mass;}
	}
	void printmass(int n) {
		/*���� ������ n �������� ������ �� �����*/
		if(n<=mass.length){
			for (int i = 0; i < n; i++){
				System.out.print(mass[i] + " ");
				}
			System.out.println(" ");
			}	
		}
	int getNumber (int number){// ���� �� �� ���������������
		return this.mass[number];		
	}
	
	private Array(int size) {
		mass = new int[size];
	}
}