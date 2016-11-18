package eldani;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	
		public static void main(String[] args) {
			
			String path = "minotauro.in";
			String pathSalida = "minotauro.out";
			try {
				Laberinto lab = new Laberinto(path);
				lab.resolver();
				lab.grabar(pathSalida);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
