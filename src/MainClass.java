import java.io.IOException;
import java.io.InputStream;

public class MainClass {
	
	public static void main(String[] args) {
		
		InputStream is;
		
		is = System.in;
		
		 try {
			System.out.println("Inserire intero:\n");
			is.read();
			
			System.out.println("Speficirare strategia 1- Ricorsivo 2 - Iterativo:\n");
			is.read();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
