
public class MainClass {
	
	private Strategy strat;
	private int num;
	
	private Fattoriale fattIter,fattRecurs;
	
	public static void main(String[] args) {
		
		new MainClass();
		
	}
	
	public MainClass() {
		
		strat = Strategy.RECURSIVE;
		
		fattIter = new FattorialIterative();
		fattRecurs = new FattorialRecursive();	
		
		
		num = 0;
		
		int i = 10, result = 1;
		
		 while (i>0) {
			  
			 i--;
			 
			 num = (int) (Math.random() * 10);
			 
			if ((i%2)==0) strat = Strategy.RECURSIVE; else strat = Strategy.ITERATIVE; 

			
			switch(strat) {
			   case RECURSIVE:
				   result = fattRecurs.Calcola(num);
				   System.out.println("Fattoriale di "+num+" calcolato con il metodo ricorsivo:"+result);
				   break;
			   case ITERATIVE:
				   result = fattIter.Calcola(num);
				   System.out.println("Fattoriale di "+num+" calcolato con il metodo iterativo:"+result);
				   break;
			}
			
		   }
		
	}
	
	
	

}
