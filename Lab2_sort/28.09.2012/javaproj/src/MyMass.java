
public class MyMass {

	int[] myMass;
	
	public void createMass(){
		int i = 10;
		createMass(10);
	}
	
	public void createMass(int[] a){
		myMass = new int[a.length];
		for (int i=0;i<a.length;i++){
			myMass[i]=a[i];
		}
	}
	
	public void createMass(int n){
		myMass = new int[n];
	}

	public void printMass() {
		// TODO Auto-generated method stub
		
	}

	public void sortBulb() {
		// TODO Auto-generated method stub
		
	}
}
