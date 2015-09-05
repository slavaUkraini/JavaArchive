
public class CanNotWriteToFileException extends Exception{

	public CanNotWriteToFileException(String s){
		super(s);
		System.out.println(s);
		printStackTrace(System.out);
	}
}
