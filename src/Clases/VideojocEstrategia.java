package Clases;

public class VideojocEstrategia extends Videojoc {

	private boolean teGestioRecursos;
	
	
	
	public VideojocEstrategia(String titol, int anySortida, double preu, boolean teGestioRecursos) {
		super(titol, anySortida, preu);
		this.teGestioRecursos = teGestioRecursos;
	}
	
	public int calcularDuradaPartida() {
		if (teGestioRecursos) {
			return 120;
		}else {
			return 90;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", gestió de recursos: " + teGestioRecursos;
	}

}
