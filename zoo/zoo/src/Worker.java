import java.io.IOException;

public class Worker {
	//String name ;
	//String prof ;

	private String name;
	private String prof;
	//private Object Animal;

	public Worker (String name, String prof ){
		this.name = name;
		this.prof = prof;
	}

	public void createW(String name, String prof) throws IOException{
		Worker one = new Worker(name, prof);
		one.name = name;
		one.prof = prof;
		System.out.println(prof + " " + name + " радий працювати в зоопарку.");
	}
	
	public String getName(){ // метод повертає ім'я
		return this.name;
	}
	
	public String getProf(){ 
		return this.prof;
	}
	
	public void buying (Animal one, String name, String type) throws IOException {
		Animal temp = new Animal(name,type);
		one = temp;
		System.out.println(one.getType() + " " + one.getName() + " радий жити в зоопарку");
		//return one;
		
	}
	
	public void looking (Animal anim){
		//Подивитись інфу про тваринку
		System.out.println("Name - " + anim.getName());
		System.out.println("Type - " + anim.getType());
		System.out.println("Health - " + anim.getHealth());
		System.out.println("Food - " + anim.getFood());
		System.out.println("It is in zoo - " + anim.getAvail());
	}

}