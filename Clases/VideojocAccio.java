package Clases;

public class VideojocAccio extends Videojoc {

	private String ritme;

	public VideojocAccio(String titol, int anySortida, double preu, String ritme) {
		super(titol, anySortida, preu);
		this.ritme = comprovar(ritme);
	}
	
	public String comprovar(String ritme) {
		if (ritme.equalsIgnoreCase("alt")||ritme.equalsIgnoreCase("baix") || ritme.equalsIgnoreCase("mitjà")) {
			return ritme;
		}else if (ritme.equalsIgnoreCase("mitja") ){
			return "mitjà";
		}else {
			return "Ritme Erroni";
		}
	}
	
	public int calcularDuradaPartida() {
		if (ritme.equalsIgnoreCase("alt")) {
			return 30;
		}else if (ritme.equalsIgnoreCase("mitjà")){
			return 45;
		}else {
			return 60;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", ritme: " + ritme;
	}
}
