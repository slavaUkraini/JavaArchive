import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;


public class myDictionary {
	
	class Location{
		Map<String, Integer> loc = new  HashMap<String, Integer>();
		public Location(String s){
			loc.put(s, 1);
			;
		}
		public void oneMoreWord(File file){
			String filename = file.getName();
			if (loc.containsKey(filename)){
				int num = loc.get(filename).intValue();
				++num;
				loc.put(filename, num);		
			}
			else loc.put(filename, 1);
		}
		public String toString()
		{
			String str = "";
			for (Map.Entry<String, Integer> entry: loc.entrySet())
				str+=entry.getKey() + " - " + entry.getValue() + ", ";
			return str;
		}
	}
	
	private ArrayList<File> files;
	private File vocabul;
	private Map<String, Location> hashmap = new HashMap<String, Location>();
	//private MyReader mr;
	
	public myDictionary(ArrayList<File> files) throws IOException{
	vocabul = new File("MyVocabulary.txt");
	if(!vocabul.exists()) {
		vocabul.createNewFile();
	}
	this.files = files;
	//mr = new MyReader(vocabul.getName());
	createDictionary();
	try{
		writeToFile(vocabul.getName());
		if (!vocabul.canWrite()){
			throw new CanNotWriteToFileException("ERROR: CanNotWriteToFile");
		}
	}
	catch (CanNotWriteToFileException e){
		vocabul.setWritable(true);
	}
	catch (Exception e){
		 e.printStackTrace(System.out);
	}
	writeToFile(vocabul.getName());
}

	private void writeToFile(String fileName) {
		 try {
	            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
	            try {
	                out.print(toString());
	            } finally {
	                out.close();
	            }
	        } catch(IOException e) {
	            throw new RuntimeException(e);
	        }		
	}

	private void createDictionary() throws FileNotFoundException{
		//MyReader mr;
		StreamTokenizer st;
		for (int i = 0; i<files.size(); i++){
			//mr = new MyReader(files.get(i).getName());
			st = new StreamTokenizer(new BufferedReader(new FileReader(files.get(i))));
			while(st.ttype!=StreamTokenizer.TT_EOF){
				try {
					if (st.nextToken()==StreamTokenizer.TT_WORD){
						if (hashmap.containsKey(st.sval)){//якщо таке слово є
							hashmap.get(st.sval).oneMoreWord(files.get(i));
							//Location temp = this.
						}
						else{
							Location temp = new Location(files.get(i).getName());
							hashmap.put(st.sval, temp);
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public String toString(){
		String str = "";
		for (Map.Entry<String, Location> entry: hashmap.entrySet())
			str+=entry.getKey() + " < " + entry.getValue().toString() + " > " + "\n";
		return str;
	}
	
}
	
