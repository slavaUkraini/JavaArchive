/**
 * Клас шифрує і дешифрує стрічку
 * 2 поля - стрічка і алфавіт
 * @author Vita Krainik
 * since 8.11.12
 *
 */
public class Encryption {
private String s;
static String alphabet_rus = ""; //Я зробила поки що тільки для російського алфавіту

public Encryption(){
	this("эюяабв");
}
public Encryption(String s){
	this.s = s;
	for(char ch='а';ch<='я';ch++){
        alphabet_rus+=ch;
    }
}

//Метод шифрування
//Тут n - це кількість позицій, на яку будемо зсувати стрічку
//y=(x+k)mod n;
public String encode(int n){
	String newStr = "";
	int temp = n;
	//Якщо зсув вліво (n<0), то зсуваємо все одно вправо
	if(temp<0){temp=-n;}
	for(int i = 0; i<s.length(); i++){
		newStr+=alphabet_rus.charAt((alphabet_rus.indexOf(s.charAt(i)) 
				+ temp)%alphabet_rus.length());
	}
	return newStr;
}

//Метод дешифрування
public String decode(){
	return encode(0);
}
public String toString(){
	return " string = " + s;
}
}


