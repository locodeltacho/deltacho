package claseArista;

import claseNodo.Nodo;

public class AristaDP {

	protected Nodo nodoOrigen;
	protected Nodo nodoDestino;
	protected int costo;
	
	public AristaDP(Nodo nodoOrigen, Nodo nodoDestino, int costo) {
		this.nodoOrigen = nodoOrigen;
		this.nodoDestino = nodoDestino;
		this.costo = costo;
	}
	
}
