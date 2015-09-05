package ua.com.vita.MyClasses;

class Cottage  extends House {
	/**
	 * ���������� ���� ������� - ������
	 * ��� ���� - ���� � ������
	 * @author Vita Krainik
	 * @version 1.0 since 29.11.2012
	 *
	 * @param args
	 */
	//��� ����� ���� - �� �� ���� ��������� �������
	//�� ������������� ���������� ����
	public Cottage() {
		super("�����", 2, 8);
		System.out.println("�� ��� �� ������ �������, �� ������.");
	}
	public String toString(){
		//������� ���� ������� ������������
		//��������� ������������
		if (pool==null) pool = new Pool();
		return super.toString()+ " ֳ�� = " + price + "\n � ���� � ������";
	}
	private int price;
	private Pool pool;
	{
		price = 100000;
		pool = new Pool();
	}
	private class Pool{
		/**
		 * ���� ������
		 * ���� - ����� �������
		 */
		public Pool(){
			System.out.println("�� ������ ������.");
			}
		private double size = 100;
		}
}
