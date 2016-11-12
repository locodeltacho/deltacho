package testeosDijkstra;

import org.junit.Test;

public class Testeo {
	@Test
	public void prueba(){
		AlgoritmoDelTacho prueba = new AlgoritmoDelTacho();
		int n = 3;
		boolean[][] m = new boolean[n][n];

		MatrizBoolean obstaculos = new MatrizBoolean(m, n, n);
		Grafo g = new Grafo(obstaculos);
		
		
		
		prueba.calcularDijkstra(g, g.getNodo(2,0));
//		for(Nodo nodo: g.getListaNodos()){
//			if(prueba.obtenerCamino(nodo) == null){
//				System.out.println("camino no encontrado a nodo"+nodo.getPunto());
//			}
//		}
		

		prueba.mostrarCamino(g.getNodo(0, 0));
		
		//prueba.obtenerCamino(g.getNodo(0, 0));
		
		//System.out.println(prueba.predecesores);
		
		//System.out.println(prueba.obtenerCamino(g.getNodo(2, 0)));
		
		//System.out.println(g);
		
	}
	
	@Test
	public void prueba123(){
		AlgoritmoDelTacho prueba = new AlgoritmoDelTacho();
		int n = 4;
		boolean[][] m = new boolean[n][n];
		m[1][0]= true; //hay ostaculo
		m[1][1]= true; //hay ostaculo
		m[1][2]= true; //hay ostaculo
		
		MatrizBoolean obstaculos = new MatrizBoolean(m, n, n);
		Grafo g = new Grafo(obstaculos);
		
		
		
		//prueba.calcularDijkstra(g, g.getNodo(0, 0));
		
		//prueba.mostrarCamino(g.getNodo(3, 0));
		
		//prueba.obtenerCamino(g.getNodo(0, 0));
		
		//System.out.println(prueba.predecesores);
		
		//System.out.println(prueba.obtenerCamino(g.getNodo(2, 0)));
		
		//System.out.println(g);
		
	}
	
	
	@Test
	public void prueba2(){
		AlgoritmoDelTacho prueba = new AlgoritmoDelTacho();
		int n = 5;
		boolean[][] m = new boolean[n][n];
		m[1][0]= true; 
		m[1][1]= true; 
		m[1][2]= true; 
		m[1][3]= true; 
		
		m[3][1]= true; 
		m[3][2]= true; 
		m[3][3]= true; 
		m[3][4]= true; 
		
		MatrizBoolean obstaculos = new MatrizBoolean(m, n, n);
		Grafo g = new Grafo(obstaculos);
		
		//prueba.calcularDijkstra(g, g.getNodo(0, 0));
		//prueba.mostrarCamino(g.getNodo(4, 4));
		
		//System.out.println(prueba.predecesores);
		
		//System.out.println(prueba.obtenerCamino(g.getNodo(4, 4)));
		
		//System.out.println(g);
		
	}
	
	
	@Test
	public void prueba3(){
		AlgoritmoDelTacho prueba = new AlgoritmoDelTacho();
		int n = 6;
		boolean[][] m = new boolean[n][n];
		m[1][3]= true; 
		m[1][4]= true; 
		
		m[2][1]= true; 
		m[2][2]= true; 
		m[2][3]= true; 
		m[2][4]= true; 
		
		
		MatrizBoolean obstaculos = new MatrizBoolean(m, n, n);
		Grafo g = new Grafo(obstaculos);
		
		//prueba.calcularDijkstra(g, g.getNodo(0, 3));
		//prueba.mostrarCamino(g.getNodo(3, 3));
		
		//System.out.println(prueba.predecesores);
		
		//System.out.println(prueba.obtenerCamino(g.getNodo(4, 4)));
		
		//System.out.println(g);
		
	}
	
	@Test
	public void prueba4(){
		AlgoritmoDelTacho prueba = new AlgoritmoDelTacho();
		int n = 11;
		boolean[][] m = new boolean[n][n];
		m[0][0]= true; 
		m[0][1]= true; 
		m[0][2]= true; 
		m[0][3]= true; 
		m[0][4]= true; 
		m[0][5]= true; 
		m[0][6]= true; 
		m[0][7]= true; 
		m[0][8]= true; 
		m[0][9]= true; 
		m[0][10]= true; 
		
		
		m[1][0]= true; 
		m[2][0]= true; 
		m[3][0]= true; 
		m[4][0]= true; 
		m[5][0]= true; 
		m[6][0]= true; 
		m[7][0]= true; 
		m[8][0]= true; 
		m[9][0]= true; 
		m[10][0]= true; 
		
		m[10][1]= true; 
		m[10][2]= true; 
		m[10][3]= true; 
		m[10][4]= true; 
		m[10][5]= true; 
		m[10][6]= true; 
		m[10][7]= true; 
		m[10][8]= true; 
		m[10][9]= true; 
			
		
		m[1][10]= true; 
		m[2][10]= true; 
		m[3][10]= true; 
		m[4][10]= true; 
		m[5][10]= true; 
		m[6][10]= true; 
		m[7][10]= true; 
		m[8][10]= true; 
		m[9][10]= true; 
		m[10][10]= true; 
		
		m[1][4]= true; 
		m[2][4]= true; 
		m[3][4]= true; 
		m[4][4]= true; 
		
		m[2][2]= true; 
		m[3][2]= true; 
		m[4][2]= true; 
		
		m[4][3]= true; 
		m[4][5]= true; 
		m[4][6]= true; 
		
		m[2][6]= true; 
		m[2][7]= true; 
		m[2][8]= true; 
		
		m[3][8]= true; 
		m[4][8]= true; 
		m[5][8]= true; 
		m[6][8]= true; 
		m[7][8]= true; 
		m[8][8]= true; 
		m[9][8]= true; 
		
		m[6][6]= true; 
		m[6][7]= true; 
		
		m[6][2]= true; 
		m[6][3]= true; 
		m[6][4]= true; 
		
		
		m[7][4]= true; 
		m[8][4]= true; 
		
		m[8][2]= true; 
		m[8][3]= true; 
		m[8][2]= true; 
		m[8][5]= true; 
		m[8][6]= true; 
		
		m[9][2]= true; 		
		
		MatrizBoolean obstaculos = new MatrizBoolean(m, n, n);
		Grafo g = new Grafo(obstaculos);
		
		//prueba.calcularDijkstra(g, g.getNodo(9, 1));
		//prueba.mostrarCamino(g.getNodo(9, 9));
		
		//System.out.println(prueba.predecesores);
		
		//System.out.println(prueba.obtenerCamino(g.getNodo(4, 4)));
		
		//System.out.println(g);
		
	}
}
