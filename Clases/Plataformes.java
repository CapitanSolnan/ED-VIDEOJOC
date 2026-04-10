package Clases;

public class Plataformes extends VideojocAccio {

	private int numMonedes;

	public Plataformes(String titol, int anySortida, double preu, String ritme, int numMonedes) {
		super(titol, anySortida, preu, ritme);
		this.numMonedes = numMonedes;
	}
	
	public int calcularDuradaPartida() {
		if (numMonedes > 100) {
			return 80;
		}else if (numMonedes >= 51 && numMonedes <= 100) {
			return 60;
		}else {
			return 50;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", monedes: " + numMonedes;
	}
	
	
}
