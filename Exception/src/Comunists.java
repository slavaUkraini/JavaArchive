
public class Comunists  {

	private int members = 0;
	
	public Comunists(int members){
		this.members = members;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	
	public void fire(int num){
		if(members>=num){
			members -= num;
		}
		else System.out.println("���� ����� �����.");
	}
		

	public int vote(int howManyCome, String law) {
		try{
			if (howManyCome > this.getMembers()){
				//���� ������ �����, �� ����� ����
				//����� ��������� �������������
				//�������
				throw new TooManyPeopleCome("Error: Too Many Votes!");
			}
		}
		catch(TooManyPeopleCome e){
			System.out.println("���� ������ �� ��������");
			return 0;
		}
		System.out.println("������������� " + howManyCome + " ����� ����. ����� "+law+" ��������");
		return howManyCome;
	}
	

}
