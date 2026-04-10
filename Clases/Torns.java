package Clases;

public class Torns extends VideojocEstrategia{

	private int duradaMitjanaPartida;

	public Torns(String titol, int anySortida, double preu, boolean teGestioRecursos, int duradaMitjanaPartida) {
		super(titol, anySortida, preu, teGestioRecursos);
		this.duradaMitjanaPartida = duradaMitjanaPartida;
	}
	
	public int calcularDuradaPartida() {
		return duradaMitjanaPartida;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", durada mitjana: " + duradaMitjanaPartida;
	}
	
}
	