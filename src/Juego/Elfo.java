package Juego;

public class Elfo extends Personaje implements Guerrero, Defensa {

	@Override
	public int modificarVida() {
		System.out.println ("bajar vida");
		return 0;
	}

	@Override
	public void atacar() {
		System.out.println ("colonia de elfos");
		
	}

	@Override
	public void defender() {
		System.out.println ("muro de magia pura");
		
	}

}
