package Juego;

public class Ejecucion {
	public static void main (String[] args) {
		Heroe heroe = new Heroe ();
		Elfo elfo = new Elfo ();
		Aldeano aldeano = new Aldeano ();
		
		heroe.atacar();
		System.out.println ();
	}
}
