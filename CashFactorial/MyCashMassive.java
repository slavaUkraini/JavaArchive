import java.math.BigInteger;


public class MyCashMassive {

	private static BigInteger[] myCashFact;
	private static int numberOfComputed=0;
	
	MyCashMassive(){
		this(20);
	}
	
	MyCashMassive(int n){
		this.myCashFact = new BigInteger[n+1];
		this.myCashFact[0] = BigInteger.valueOf(1);
		this.myCashFact[1] = BigInteger.valueOf(1);
		this.numberOfComputed = 1;
	}
	
	public BigInteger calcCashFact(int n){
		if ((n<0)||(n>this.myCashFact.length-1)){
			return BigInteger.valueOf(-1);
		}
		else if (n<=this.numberOfComputed){
			return this.myCashFact[n];
		}
		else {
			for (int i = this.numberOfComputed+1;i<=n;i++){
				System.out.println("Ðàõóºìî "+i);
				this.myCashFact[i]=this.myCashFact[i-1].multiply(BigInteger.valueOf(i));
			}
			this.numberOfComputed = n;
			return this.myCashFact[n];
		}
	}
}
