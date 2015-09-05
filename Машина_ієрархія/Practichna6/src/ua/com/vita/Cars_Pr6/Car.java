package ua.com.vita.Cars_Pr6;

public class Car {
	private String name = "Black Lightning";
	private boolean fullTank = false; //Повний бак
	private String colour = "Black";
	private boolean dirty = false;
	private int wheelNumber = 4;
	private Wheel[] wheels = new Wheel[wheelNumber];
	//private String fuel = "бензин";//Пальне
	private int doorsNumber = 4;
	private Doors[] doors = new Doors[doorsNumber];
	private int windowsNumber = 2;
	private Window[] windows = new Window[windowsNumber];
	
	public Car(String name, String colour){
		this.name = name;
		this.colour = colour;
	}
}
