package ua.com.vita.MyClasses;

public class IdealMen extends Men {
	/**
	 * Розширений клас Чоловіків - клас Ідеальних чоловіків
	 * нові поля - освіта і почуття гумору
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
		//кожен чоловік повинен збудувати будинок
		House dom = new Cottage();
		System.out.println(dom);
	}
	public IdealMen bornSon(String name) {
		//Довелось перевизначати метод, чому, я не хотіла
		//Де моє висхідне перетворення?
		//метод народити сина
		//він не обов'язково має сам народжувати =)
		IdealMen son = new IdealMen(name,1,"безробітний"," - ");
		//son = this.clone();//Так не можна?
		return son;
	}
	public void getEducation(String degree){
		education = degree;
	}
	public String toString(){
		return super.toString() + "\nОсвіта: " 
				+ education + "\nТа ще й з почуттям гумору!";
	}
	private String education = "Школяр";
	//кожен нормальний чоловік повинен мати почуття гумору
	final private boolean humor = true;
	
}
