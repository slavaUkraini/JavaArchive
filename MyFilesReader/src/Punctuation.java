import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;


public class Punctuation  implements Runnable{
	
	public Thread thread;
	public Bag<File> files;
	public int finished = 0;
	
	Punctuation (Iterable<File> f){
	thread = new Thread(this);
	files = (Bag<File>) f;
	thread.start();
}


	@Override
	public void run() {
		Iterator<File> iterator = files.iterator();
		while(iterator.hasNext()){
			File f = iterator.next();
			System.out.println("Punctuation thread started"+f.getName());
			try {
				Scanner in = new Scanner(f);
				
				Bag<String> bag = new Bag();
				while(in.hasNext()){
					String s = in.next().replaceAll("[^a-zA-Z]", "");
					s+=" ";
					bag.add(s);
				}
				in.close();
				FileWriter ou = new FileWriter(f); 
				Iterator<String> iterator2 = bag.iterator();

				ou.write("");
				while(iterator2.hasNext()){
					ou.write(iterator2.next());
				}
				ou.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Punctuation thread end"+f.getName());
			finished++;
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
