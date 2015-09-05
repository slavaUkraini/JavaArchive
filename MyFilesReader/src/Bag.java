

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>{
	
protected Item[] s;
protected int n =0;

public Bag(){
	//s = new Item[1]; //оголошення generics масивів заборонена
	s = (Item[])new Object[1];
}

public void add(Item item) {
	if (n==s.length) resize(2*s.length);
	s[n++] = item;
}

public void replace(Item item, int number){
	if(number<s.length){
		s[number]=item;
	}
}

public int size() {
	return n;
}

private void resize(int capacity){
	Item[] copy = (Item[])new Object[capacity];
	for (int i=0;i<n;i++)
		copy[i]=s[i];
	s = copy;
}
@Override
public Iterator<Item> iterator() {
	return new ReverseArrayIterator();
}

private class ReverseArrayIterator implements Iterator<Item>{

	private int i=0;
	@Override
	public boolean hasNext() {
		return i<n;
	}

	@Override
	public Item next() {
		return s[i++];
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}	
}
}
