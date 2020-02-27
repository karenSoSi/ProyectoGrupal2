package cl.awakelab.proyectoModulo;

/*
 * Clase Padre, hereda sus atributos a 3 clases hijas (Kromi, Caguano, Trupalla.
 * @author: Fernanda - Javiera - Karen - Andrea 
 * @version: 24/02/2020 
 */
public class Carro {


	/*
	 * Atributos principales que se heredaran a las clases hijas
	 * los atributos fila y columna nos indica la ubicación que se tendra en el tablero
	 */
	private int cantidadOcupantes;
	private String fechaIngreso;
	private int fila;
	private int columna;
	
	/*
	 * CONSTRUCTOR
	 * @param cantidadOcupantes cantidad de ocupantes en los carros
	 * @param fechaIngreso fecha de ingreso de los carros
	 * @fila @columna nos indica la ubicación de los carros en el tablero
	 */
	public Carro(int cantidadOcupantes, String fechaIngreso, int fila, int columna) {
		super();
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.fila = fila;
		this.columna = columna;
	} //Cierre de constructor
	
	
	//Metodos Get y Set
	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}
	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
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
	
	//Metodo toString
	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", fila=" + fila
				+ ", columna=" + columna + "]";
	}
	
	
	
	
	
	
	
}
