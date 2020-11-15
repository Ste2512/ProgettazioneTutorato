
// TODO: Auto-generated Javadoc
/**
 * 
 * The Class NumberSum.
 * La classe effettua la somma di numeri
 *  @author Stefano
 *  
 */
public class NumberSum {

	/** The a. */
	int a;
	
	/** The b. */
	int b;
	
	/**
	 * Instantiates a new number sum.
	 */
	public NumberSum() {
		a=b=0;
	}
	
	/**
	 * Number sum.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the int
	 */
	public NumberSum(int a,int b) {
		super();
		this.a=a;
		this.b=b;
	}
	
	/**
	 * Sets the a.
	 *
	 * @param a the new a
	 */
	public void setA(int a) {
		this.a=a;
	}
	
	/**
	 * Sets the b.
	 *
	 * @param b the new b
	 */
	public void setB(int b) {
		this.b=b;
	}
	
	/**
	 * Gets the a.
	 *
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	
	/**
	 * Gets the b.
	 *
	 * @return the b
	 */
	public int getB() {
		return b;
	}
	
	/**
	 * Calcola somma.
	 *
	 * @return the sum
	 */
	public int getSomma() {
		return a+b;
	}
		
		/**
		 * The main method.
		 *
		 * @param args the arguments
		 */
		public static void main(String[] args) {
			NumberSum ns=new NumberSum();
			ns.setA(2);
			ns.setB(4);
			
			System.out.println(ns.getSomma());
		}
		// TODO Auto-generated method stub


}