package ua.com.vita.MyClasses;

public class IdealMen extends Men {
	/**
	 * ���������� ���� ������� - ���� ��������� �������
	 * ��� ���� - ����� � ������� ������
	 * @author Vita Krainik
	 * @version 1.0 since 29.11.2012
	 *
	 * @param args
	 */
	public IdealMen(String name, int age, String jobStatus,String degree) {
		super(name, age, jobStatus);
		getEducation(degree);
	}

	public void buildHouse(){
		//����� ������ ������� ��������� �������
		House dom = new Cottage();
		System.out.println(dom);
	}
	public IdealMen bornSon(String name) {
		//�������� ������������� �����, ����, � �� �����
		//�� �� �������� ������������?
		//����� �������� ����
		//�� �� ����'������ �� ��� ����������� =)
		IdealMen son = new IdealMen(name,1,"����������"," - ");
		//son = this.clone();//��� �� �����?
		return son;
	}
	public void getEducation(String degree){
		education = degree;
	}
	public String toString(){
		return super.toString() + "\n�����: " 
				+ education + "\n�� �� � � �������� ������!";
	}
	private String education = "������";
	//����� ���������� ������ ������� ���� ������� ������
	final private boolean humor = true;
	
}
