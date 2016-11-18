package eldani;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Laberinto {
	protected int[][] matrizPasajes;
	protected int[] padres;
	protected ArrayList<Pasaje> pasajes;
	protected ArrayList<Pasaje> solucion;

	public Laberinto(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		int dimension = sc.nextInt();
		matrizPasajes = new int[dimension][dimension];
		padres = new int[dimension];
		pasajes = new ArrayList<Pasaje>();
		solucion = new ArrayList<Pasaje>();

		for (int i = 0; i < matrizPasajes.length; i++) {
			padres[i] = i;
			for (int j = 0; j < matrizPasajes.length; j++) {
				matrizPasajes[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < matrizPasajes.length; i++) {
			for (int j = i + 1; j < matrizPasajes.length; j++) {
				pasajes.add(new Pasaje(i, j, matrizPasajes[i][j]));
			}
		}

		Collections.sort(pasajes);

		sc.close();
	}

	public boolean resolver() {

		if (pasajes.isEmpty())
			return false;

		for (Pasaje aux : pasajes) {
			if (find(aux.inicio) != find(aux.fin)) {
				solucion.add(aux);
				union(aux.inicio, aux.fin);
			}

		}

		return true;

	}

	public void grabar(String path) throws IOException {

		PrintWriter sale = new PrintWriter(new FileWriter(path));
		for (Pasaje aux : solucion) {
			sale.println((aux.inicio+1)+" "+(aux.fin+1)+" "+aux.pasos);
		}

		sale.close();
	}

	public int find(int x) {
		if (x == padres[x]) { // Si estoy en la raiz
			return x; // Retorno la raiz
		}
		// else return Find( padre[ x ] ); //De otro modo busco el padre del
		// vértice actual, hasta llegar a la raiz.
		else
			return padres[x] = find(padres[x]); // Compresion de caminos
	}

	public void union(int x, int y) {
		int xRoot = find(x); // Obtengo la raiz de la componente del vértice X
		int yRoot = find(y); // Obtengo la raiz de la componente del vértice Y
		padres[xRoot] = yRoot; // Mezclo ambos arboles o conjuntos, actualizando
								// su padre de alguno de ellos como la raiz de
								// otro
	}
}
