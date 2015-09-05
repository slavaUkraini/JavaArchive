import java.math.BigInteger;


public class CachFactorial {

	private static BigInteger[] cashFact;
	private static int lastFactNumber=0;
	
	public CachFactorial(){
		this(21);
	}
	
	public CachFactorial(int i){
		this.cashFact = new BigInteger[i+1];
		cashFact[0]=BigInteger.valueOf(1);
		cashFact[1]=BigInteger.valueOf(1);
		this.lastFactNumber=1;
	}
	
	
	
	public BigInteger cashFactorial(int i){
		if ((i<0) || (i>this.cashFact.length-1)){
			return BigInteger.valueOf(-1);
		}
		else if(i<=this.lastFactNumber){
			return this.cashFact[i];
		}
		else{
			
			for (int n=this.lastFactNumber+1;n<=i;n++){
				System.out.println("Рахую "+n);
				this.cashFact[n] = this.cashFact[n-1].multiply(BigInteger.valueOf(n));
			}
			this.lastFactNumber = i;
			return this.cashFact[i];
		}
	}
	
}
