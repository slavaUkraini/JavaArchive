package ua.com.vitik;

public class Hell {
	
	private String colour = "RED";
	private int temperature = 40;
	
	private void increaseTemperature(){
		temperature+=5;
		System.out.println("����������� � ��������� ������ = " +
				+ temperature + " �������." );
	}
	
	public class Evil implements Premier{

		@Override
		public void command(Worker w) {
			System.out.println("�� - ��������!");
			w.doSomething();
		}

		@Override
		public void talkToPeople() {
			System.out.println("� ��� ����� 30 000 �����, �� ���������!");
		}

		@Override
		public void doSomething() {
			System.out.println("����� ������ ���������...");
			increaseTemperature();
		}
		
	}

	public class Bis implements Worker{

		@Override
		public void doSomething() {
			increaseTemperature();
		}

		@Override
		public void sing() {
			System.out.println("� ������� �� �������� �����,\n" +
					"� ������� ����� ���� �� ��������,\n" +
					"� � ����� ��� ����� �������\n" +
					"��������� ��������� ������.\n");
		}
		
	}
	public static void openHell(){
		Hell rai = new Hell();
		Hell.Evil head = rai.new Evil();
		Hell.Bis student = rai.new Bis();
		head.command(student);
		head.doSomething();
		head.talkToPeople();
		student.sing();
	}
}
