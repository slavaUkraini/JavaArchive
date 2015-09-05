package ua.com.vitik;

public class Paradise {
	
	private boolean light = true;
	
	private void turnLight(){
		if (light == true){
			light = false;
			System.out.println("Light OFF");
		}
		else {
			light = true;
			System.out.println("Light ON");
		}
	}

	public class God implements Premier{
		private boolean visible = false;

		@Override
		public void command(Worker w) {
			System.out.println("�������� ���������� ������ � ��������� ���!");
			w.doSomething();
		}

		@Override
		public void talkToPeople() {
			System.out.println("��� �� ��� �� ��, ��� �������" +
					", ��������� �� ���.");
		}

		@Override
		public void doSomething() {
			visible = true;	
			turnLight();
		}		
	}
	public class Angel implements Worker{

		@Override
		public void doSomething() {
			System.out.println("��� �� �����!");
			miracle();	
			turnLight();
		}
		private void miracle(){
			System.out.println("� ���� ���!!!");
		}
		@Override
		public void sing() {
			System.out.println("���� ������, �� ������,\n" +
					"���� �������� �� ���� ��������,\n" +
					"���� ��������� �� ������,\n" +
					"������ ����� �� ���������.");
		}
		
	}
	
	public static void openParadise(){
		Paradise rai = new Paradise();
		Paradise.God head = rai.new God();
		Paradise.Angel student = rai.new Angel();
		head.command(student);
		head.doSomething();
		head.talkToPeople();
		student.sing();
	}
	
}
