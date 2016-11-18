package eldani;

public class Pasaje implements Comparable<Pasaje>{

	protected int inicio;
	protected int fin;
	protected int pasos;
	
	public Pasaje(int inicio, int fin, int pasos) {
		this.inicio = inicio;
		this.fin = fin;
		this.pasos = pasos;
	}

	@Override
	public int compareTo(Pasaje o) {
		if(this.pasos>=o.pasos)
			return 1;
		
		return -1;
	}
	
	
}
