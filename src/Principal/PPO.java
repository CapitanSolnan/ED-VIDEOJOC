package Principal;
import Clases.*;

public class PPO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Videojoc[] juegos = {
				new Videojoc("Minecraft", 2011, 26.95),
				new VideojocAccio("Hades", 2020, 24.99, "Alt"),
				new VideojocEstrategia("Banished", 2014, 18.50, true),
				new Shooter("Doom", 1993, 19.99, "Alt", "Escopeta"),
				new Plataformes("Super Mario Bros", 1985, 14.99, "Mitjà", 100),
				new Estrategia("StarCraft", 1998, 24.99, true, 3),
				new Torns("Civilization VI", 2016, 39.99, true, 90)
		};
		for (int i = 0; i < juegos.length; i++) {
			System.out.println(juegos[i]);
			System.out.println();
			System.out.println("Durada estimada: " + juegos[i].calcularDuradaPartida() + " minuts");
			System.out.println();	
		}
	}
}
