package ua.com.vitik;

public class Hell {
	
	private String colour = "RED";
	private int temperature = 40;
	
	private void increaseTemperature(){
		temperature+=5;
		System.out.println("Температура в червоному корпусі = " +
				+ temperature + " градусів." );
	}
	
	public class Evil implements Premier{

		@Override
		public void command(Worker w) {
			System.out.println("Ви - найкращі!");
			w.doSomething();
		}

		@Override
		public void talkToPeople() {
			System.out.println("У нас більше 30 000 людей, ти наступний!");
		}

		@Override
		public void doSomething() {
			System.out.println("Треба чимось зайнятися...");
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
			System.out.println("І навколо ніч вогняною лавою,\n" +
					"і київська траса десь під Полтавою,\n" +
					"і в кожній фурі тінями темними\n" +
					"ховаються перелякані демони.\n");
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
