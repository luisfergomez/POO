package Juego;

public abstract class Personaje {
	private String nombre;
	private int vida;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public abstract int modificarVida();
	
}
