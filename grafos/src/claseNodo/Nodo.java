package claseNodo;

public class Nodo {
		protected Integer id;
		protected Integer grupo;
		
		
		public Nodo(int id) {
			this.id = id;
			
			//para kruskal
			this.grupo = id;
		}
		
}
