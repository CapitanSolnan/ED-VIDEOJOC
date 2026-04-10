package Clases;

public class Shooter extends VideojocAccio {

	private String tipusArmaPrincipal;

	public Shooter(String titol, int anySortida, double preu, String ritme, String tipusArmaPrincipal) {
		super(titol, anySortida, preu, ritme);
		this.tipusArmaPrincipal = tipusArmaPrincipal;
	}
	
	public int calcularDuradaPartida() {
		if (tipusArmaPrincipal.equalsIgnoreCase("Franctirador")) {
			return 50;
		}else if (tipusArmaPrincipal.equalsIgnoreCase("Escopeta")) {
			return 35;
		}else {
			return 40;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", arma principal: " + tipusArmaPrincipal;
	}
	
}
