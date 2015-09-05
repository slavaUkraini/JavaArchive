import java.io.IOException; 
/**
 * Class Arrays
 * Do not copy, it is my program.
 * @author Vita Krainik
 * @version 3.0 since 20.10.2012
 */
public class MyArray {
	int[] mass;
	//���� ���� ������, � ���� privat?
	
	public MyArray(int size)throws IOException {
		mass = new int[size];
		for(int i = 0; i < size; i++){
			System.out.print("������ " + (i + 1) + "-� ������� ������: ");
			this.mass[i] = DataInput.getInt();//���� ��� this?
		}
	}	
	public MyArray (int[]a) {
		//�� ��������� �� ������ ������ ������ ������
		mass = new int[a.length];	
		for (int i = 0; i < a.length;i++){
			this.mass[i] = a[i];
		}	
	}
	public MyArray (MyArray massout) {
		//�� ��������� �� ������ ������ ������ ��'����
		mass = new int[massout.mass.length];
		
		for (int i = 0; i < this.mass.length;i++){//����������� �� ����� ���� ������ ����� �����?
			this.mass[i] = massout.mass[i];
		}	
	}
	
	public void printmass () {
		/*���� �������� ������ �� �����*/
		for (int i = 0; i < mass.length; i++){
			System.out.print(mass[i] + " ");
		}
		System.out.println(" ");
	}
	
	public void sortvybir () {
		//sorting
		for (int i = 0; i < mass.length; i++) {
			  int min = mass[i];
			  int imin = i; 
			  
			  for (int j = i+1; j < mass.length; j++) {
				  
				  if (mass[j] < min)
				  {
					  min = mass[j];
			          imin = j;
			          }
			    }
			    
			  if (i != imin) {
			        int temp = mass[i];
			        mass[i] = mass[imin];
			        mass[imin] = temp;
			    }
			}
		 printmass();
	}
	void swap( int i, int j) {
	    int t = mass[i];
	    mass[i] = mass[j];
	    mass[j] = t;
	}
	public void sortbulb(){
		for(int i=mass.length-1;i>=0;i--) {
			for(int j=0; j<i;j++){
				if(mass[j]>mass[j+1])
					swap(j,j+1);
				}
		}
		printmass();
		}
	public void sortvstavka(){
		for(int i=0; i<mass.length;i++){
			int copyNumber=mass[i];
			int j = i;
			while (j>0 && copyNumber < mass[j-1]){
			mass[j]=mass[j-1]	;
			j--;
			}
			mass[j]=copyNumber;
		}
		printmass();
		
	}
			 
}