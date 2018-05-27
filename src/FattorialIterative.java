
public class FattorialIterative extends Fattoriale {

	@Override
	public int Calcola(int n) {
		
		int result = 1; 
		
		if (n<=1) return result;
		
		while (n>1) {
			result = result *n;
			n--;
		}	
		
		return result;
		
	}

}
