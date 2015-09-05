/**
	 * ���� ������� ������
	 * 
	 * @author Vita Krainik
	 * @version 1.0 since 8.11.2012
	 *
	 * @param args
	 * @throws IOException 
	 */
public class Adress {
	private String name;
	private String street;
	private int numhouse;
	private int numflat;
	private String town;
	private String region;
	private int index;

	public Adress(){
		this("���� ������","�������",1,2,"̳������","�����������",10101);
	}
	public Adress(String name,String street,int numhouse,
			int numflat,String town,String region,int index){
		this.name = name;
		this.street = street;
		this.numhouse = numhouse;
		this.numflat = numflat;
		this.town = town;
		this.region = region;
		this.index = index;
	}
	
	public String toString() {
		return " ��'�: " + this.name + "\n ������ " + this.street + 
				"\n ������� � " + this.numhouse + "\n �������� " + 
				this.numflat + "\n ̳��� " + this.town + "\n ����� " + 
				this.region + "\n �������� ������ " + this.index;
	}
}
