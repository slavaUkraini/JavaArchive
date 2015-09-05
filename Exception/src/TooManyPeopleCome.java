
public class TooManyPeopleCome extends Exception{

	public TooManyPeopleCome(String s) {
		super(s);
		System.out.println(s);
		printStackTrace(System.out);
		System.out.println("Мир труд май!");
	}
}
