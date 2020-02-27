package cl.awakelab.proyectoModulo;

public class Huevo {

	//Atributos
	private int fila;
	private int columna;
	private int puntaje;
	
	
	//Constructor por defecto
	public Huevo() {
		
	}
	
	/*
	 * Constructor con 3 parametros
	 * @param fila
	 * @param columna
	 * @param puntaje
	 */
	public Huevo(int fila, int columna, int puntaje) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.puntaje = puntaje;
	}
	
	
	//Metodos Get y Set
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	//Metodos toString
	@Override
	public String toString() {
		return "Huevo [fila=" + fila + ", columna=" + columna + ", puntaje=" + puntaje + "]";
	}
	
	
}
