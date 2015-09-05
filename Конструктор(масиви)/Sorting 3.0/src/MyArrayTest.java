import java.io.IOException;

public class MyArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Створення об'єкту MyArray, що має поле масив.");
		System.out.println("Введіть кількість елементів масиву: ");
		int n = DataInput.getInt();
		MyArray mass = new MyArray(n);
		System.out.println("Виведення масиву на екран: ");
		mass.printmass();
		System.out.println("Створення об'єкту MyArray, дано масив попереднього об'єкту.");
		MyArray mass1 = new MyArray(mass.mass);//копіювання поля "масив"
		mass1.printmass();
		System.out.println("Створення об'єкту MyArray, в конструктор передаємо об'єкт.");
		MyArray mass2 = new MyArray (mass);//копіювання об'єкту
		mass2.printmass();
		System.out.println("Перевірка");
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
		System.out.println("Сортування першого об'єкту методом вставки: ");
		mass.sortvstavka();
		System.out.println("Сортування другого об'єкту вибором: ");
		mass1.sortvybir();
		System.out.println("Сортування третього об'єкту бульбашковим методом: ");
		mass2.sortbulb();
		System.out.println("Дякую за увагу!");
	}

}
