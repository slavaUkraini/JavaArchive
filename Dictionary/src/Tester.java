import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Tester {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ArrayList<File> files = new ArrayList<File>();
		for(int i = 1; i<5; i++){
		File file = new File(i + ".txt");
		if(!file.exists()) {
			 try{
				 	file.createNewFile();
			    }
			 catch(Exception e){
			        System.err.println("WARNING: CANNOT CREATE FILE");
			    }
		} 
		files.add(file);
		}
		myDictionary md = new myDictionary(files);
		//System.out.println(md);
		System.out.println("It's working! Look at 'MyVocabulary.txt'");
	}

}
