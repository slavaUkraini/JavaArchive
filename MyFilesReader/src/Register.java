import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;


public class Register implements Runnable{
	public Thread thread;
	public Bag<File> files;
	public int finished = 0;
	
	Register(Iterable<File> f){
		thread = new Thread(this);
		files = (Bag<File>) f;
		thread.start();
	}
	
	@Override
	public void run() {
		Iterator<File> iterator = files.iterator();
		while(iterator.hasNext()){
			File f = iterator.next();
			System.out.println("LOWCASE thread started"+f.getName());
			
			try {
				Scanner in = new Scanner(f);
				
				Bag<String> bag = new Bag();
				while(in.hasNext()){
					bag.add(in.nextLine().toLowerCase());
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
			System.out.println("LOWCASE thread ended"+f.getName());
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
