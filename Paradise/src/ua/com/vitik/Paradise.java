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
			System.out.println("Здавайте благодійний внесок у розбудову Раю!");
			w.doSomething();
		}

		@Override
		public void talkToPeople() {
			System.out.println("Тут не такі як всі, тут особливі" +
					", вступайте до нас.");
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
			System.out.println("Гоу на мітинг!");
			miracle();	
			turnLight();
		}
		private void miracle(){
			System.out.println("Я можу все!!!");
		}
		@Override
		public void sing() {
			System.out.println("Тому літайте, мої хороші,\n" +
					"доки тривають ці ночі найдовші,\n" +
					"доки тягнуться ці дороги,\n" +
					"літайте попри всі застороги.");
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
