import java.io.IOException;


public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the zoo!");
		
		//������� ����������
		System.out.println("Name of the worker!");
		String nameW = DataInput.getString();
		System.out.println("Profession of the worker!");
		String prof = DataInput.getString();
		Worker some = new Worker (nameW,prof);
		some.createW(nameW, prof);
		System.out.println("Name - " + some.getName());
		System.out.println("Profession - " + some.getProf());
		
		//������ ��������
		System.out.println("Name of the animal!");
		String name = DataInput.getString();
		System.out.println("Type of the animal!");
		String type = DataInput.getString();
		Animal anim = new Animal(name, type);
		some.buying(anim, name, type);
		
		//���������� ���� ��� ��������
		some.looking(anim);

	}

}
