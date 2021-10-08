package Juego;

public class Heroe extends Personaje implements Guerrero, Defensa {
	
	@Override
	public int modificarVida() {
		System.out.println ("Bajando vida");
		return 0;
	}

	@Override
	public void atacar() {
		System.out.println ("ataque de luz");
		
	}

	@Override
	public void defender() {
		System.out.println ("escudo activado");
		
	}
	
}
