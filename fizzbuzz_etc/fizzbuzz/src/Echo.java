import java.io.IOException;

public class Echo {
	String s;
	
	public void createObject() throws IOException{
		System.out.println("¬вед≥ть дан≥: ");
		s = DataInput.getString();
	}
	public void echo(){
		System.out.println(s);
	}
	public void echoBack (){
		for(int i = s.length()-1; i >= 0; i--){
			System.out.print(s.charAt(i));
		}
	}

}
