import java.io.File;


public class MAIN {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Bag<File> b = new Bag<File>();
		///????
		synchronized(b){
		b.add(new File("1.txt"));
		b.add(new File("2.txt"));
		b.add(new File("3.txt"));
		Register r = new Register(b);
		SameWords sw = new SameWords(b);
		//r.thread.join();
		sw.thread.join();
		
		while((r.finished!=b.size())&&(sw.finished!=b.size())){}
		Punctuation p = new Punctuation(b);
	}
	}
}
