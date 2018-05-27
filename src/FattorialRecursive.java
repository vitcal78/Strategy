
public class FattorialRecursive extends Fattoriale {

	@Override
	public int Calcola(int n) {

		if (n>1) return n*Calcola(n-1); else return 1;
		
	}

}
