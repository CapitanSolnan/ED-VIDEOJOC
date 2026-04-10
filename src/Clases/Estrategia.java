package Clases;

public class Estrategia extends VideojocEstrategia{

	private int numFaccions;

	public Estrategia(String titol, int anySortida, double preu, boolean teGestioRecursos, int numFaccions) {
		super(titol, anySortida, preu, teGestioRecursos);
		this.numFaccions = numFaccions;
	}

	public int calcularDuradaPartida() {
		if (numFaccions == 2) {
			return 90;
		}else if (numFaccions == 3) {
			return 120;
		}else if (numFaccions > 3) {
			return 150;
		}else {//Si estas sol no pots comenzar aixi que no te temps
			return 0;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", faccions: " + numFaccions;
	}
}
