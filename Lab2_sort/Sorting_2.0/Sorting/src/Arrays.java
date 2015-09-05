/* Do not copy, it is my program.
 * 
 * version 2.0
 * 
 */

import java.io.IOException;
import java.util.Random;
public class Arrays {
	/**
	 * Class Arrays
	 * 
	 * @author Vita Krainik
	 * @version 2.0 since 4.10.2012
	 */
	
	int[] mass;
	
	public void createmass () throws IOException {
		/*Створює масив з 5 елементів, якщо нічого не дано*/
		int i=5;
		createmass(i);
	}
	public void createmass (int[]a) {
		mass = new int[a.length];//це копіювання масиву
		
		for (int i = 0; i < a.length;i++){
			mass[i] = a[i];
		}	
	}
	public void createmass (int n)throws IOException {
		mass = new int[n];//створення масиву з заданою кількістю елементів
		
		for (int i = 0; i < n; i++){
			System.out.println("Введіть "+ (i+1) + " елемент масиву: ");
			int temp = DataInput.getInt();
			mass[i] = temp;
		}
	}
	public void printmass () {
		/*Вивід елементів масиву на екран*/
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
	public void sortbulb() {
		//sorting
		for (int i = mass.length - 1; i >= 2; i--) {
			  boolean sorted = true;
			    
			  
			  for (int j = 0; j < i; j++) {
				  
				  if (mass[j] > mass[j+1]) {
					  int temp = mass[j];
					  mass[j] = mass[j+1];
					  mass[j+1] = temp;
			          sorted = false;
			          }
			    }
			  
			  if (sorted) {
				  break;
			    }
			}
		  printmass();
		
	}
	public void sortvstavka() {
		//sorting 
		for (int i = 1; i < mass.length; i++){
		    int t = mass[i];
		    int j = 0;
		    
		    while (t > mass[j]){
		    	j = j + 1;
		    }
		    
		    for (int k = i - 1; k > j; k--){
		      mass[k + 1] = mass[k];
		      mass[j] = t;
		    }
		  }
		  printmass();		
	}
	public void main(int n) throws IOException { 
		createmass(n);
		sortvybir();
		//printmass();
		
	}
	public void randomcreate(int n, int k) throws IOException {
		/*Заповнює даний масив довільними цілими числами*/
		mass = new int[n];
		
		for (int i = 0; i < mass.length; i++){
			mass[i]=new Random().nextInt(k);
		}
		printmass();
	}
}
