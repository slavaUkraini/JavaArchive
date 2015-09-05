/*(c) Vita Krainik
 */
import java.io.IOException;
/**
 * Class sorting of arrays
 * @version 27.09.2012
 * @author Vita
 *
 */

public class Sorting {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("������ ������� �������� ������");
		
		int n = DataInput.getInt();
		int a[] = new int[n];
		
		System.out.println("������ �����: ");
		
		for (int i = 0; i < n; i++)
		  {
			  a[i] = DataInput.getInt();
		  }
		
		//���������� �������
		/**vybir**/
		  for (int i = 0; i < n; i++) {
			  int min = a[i];
			  int imin = i; 
			  for (int j = i+1; j < n; j++) {
				  if (a[j] < min)
				  {
					  min = a[j];
			          imin = j;
			          }
			    }
			    if (i != imin) {
			        int temp = a[i];
			        a[i] = a[imin];
			        a[imin] = temp;
			    }
			}
		  for (int i = 0; i < n; ++i) {
			  System.out.print (a[i]+" ");
		  }
		  
		  // � ����� ���������
		  
		  for (int i = n - 1; i >= 2; i--) {
			  boolean sorted = true;
			    
			  for (int j = 0; j < i; j++) {
				  if (a[j] > a[j+1]) {
					  int temp = a[j];
			          a[j] = a[j+1];
			          a[j+1] = temp;
			          sorted = false;
			          }
			    }
			  if (sorted) {
				  break;
			    }
			}
		  System.out.print(" ; ");
		  for (int i = 0; i < n; ++i) {
			  System.out.print(a[i] + " ");
		  }
		  
		 
		//���������� ������� �������
		  /*for (int i = 1; i<array.length; ++i)
		  {
			//System.out.print(i);
		    int t = array[i];
		    int j = 0;
		    while (t > array[j])
		    	j = j + 1;
		    for (int k = i-1 ; j>=1; --j)
		      array[k+1] = array[k];
		    array[j] = t;
		  
		  }*/
		  
	}

}
