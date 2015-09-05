package ua.com.vita.krainik.firstPackage;

/**
 * Class FactCache
 * Do not copy, it is my program
 * @author Vita Krainik
 * @version 2.0 since 4.10.2012
 */

public class Factorial {
	private static Array factorValue = new Array();
	private static int lastFactNumber=0;
	
	//public Factorial(){
		//this(0);
	//}
	
	public Factorial(){
		//this.factorValue = new Array();
		if (factorValue.getLength() == 0){//���� �� �� ��������� ������ ��'��� � � ��� ������ ����
			factorValue.addEnd(1);//�� ����� ��������� � �������� �������
			factorValue.addEnd(1);
			//cashFact[1]=BigInteger.valueOf(1);
			lastFactNumber=1;}
	}
	
	public int cashFactorialTest(int i) {
		/*����������� ��������� ������ ����� �� ��������� ��������� */
		if (i<0){
			return -1;
		}
		else if(i<=lastFactNumber){
			return factorValue.getElement(i);
		}
		else{
			
			for (int n = lastFactNumber + 1; n <= i; n++){
				System.out.println("����� " + n);
				factorValue.addEnd(factorValue.getElement(n-1)*n);
				}
			lastFactNumber = i;
			return factorValue.getElement(i);
		}
	}
}

