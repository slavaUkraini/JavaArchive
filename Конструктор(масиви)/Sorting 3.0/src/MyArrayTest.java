import java.io.IOException;

public class MyArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("��������� ��'���� MyArray, �� �� ���� �����.");
		System.out.println("������ ������� �������� ������: ");
		int n = DataInput.getInt();
		MyArray mass = new MyArray(n);
		System.out.println("��������� ������ �� �����: ");
		mass.printmass();
		System.out.println("��������� ��'���� MyArray, ���� ����� ������������ ��'����.");
		MyArray mass1 = new MyArray(mass.mass);//��������� ���� "�����"
		mass1.printmass();
		System.out.println("��������� ��'���� MyArray, � ����������� �������� ��'���.");
		MyArray mass2 = new MyArray (mass);//��������� ��'����
		mass2.printmass();
		System.out.println("��������");
		if( mass.equals(mass1)){
			System.out.println("mass equals mass1");
		}
		else{
			System.out.println("mass doesn't equal mass1");
		}
		if( mass1.equals(mass2)){
			System.out.println("mass1 equals mass2");
		}
		else{
			System.out.println("mass1 doesn't equal mass2");
		}
		if( mass.equals(mass2)){
			System.out.println("mass equals mass2");
		}
		else{
			System.out.println("mass doesn't equal mass2");
		}
		System.out.println("���������� ������� ��'���� ������� �������: ");
		mass.sortvstavka();
		System.out.println("���������� ������� ��'���� �������: ");
		mass1.sortvybir();
		System.out.println("���������� �������� ��'���� ������������ �������: ");
		mass2.sortbulb();
		System.out.println("����� �� �����!");
	}

}
