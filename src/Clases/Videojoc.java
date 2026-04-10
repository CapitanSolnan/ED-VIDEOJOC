package Clases;

public class Videojoc {

	private String titol;
	private int anySortida;
	private double preu;
	
	public Videojoc(String titol, int anySortida, double preu){
		this.titol = titol;
		this.anySortida = anySortida;
		this.preu = preu;
		
	}
	public int calcularDuradaPartida() {
		return 60;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Títol: " + titol + ", any: " + anySortida + ", preu: " + preu;
	}
}
