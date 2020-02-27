package cl.awakelab.proyectoModulo;

/*
 * Clase hija de Carro. Hereda sus atributos
 * @author: Fernanda - Javiera - Karen - Andrea 
 * @version: 24/02/2020 
 */

public class Kromi extends Carro {

	//ATRIBUTOS
	private int anioFabricacion;
	private String marca;
	

	/*
	 * Constructor con 3 parametros heredados de la clase Carro y 2 parametros propios
	 * @see Carro
	 * @param cantidadOcupantes parametro que hereda de la clase padre "Carro"
	 * @param fechaIngreso parametro que hereda de la clase padre "Carro"
	 * @param fila @param columna parametro que hereda de la clase padre "Carro"
	 * @param anioFabricacion nos indica el año de fabricacion del carro
	 * @param marca nos dice la marca del carro
	 */
	public Kromi(int cantidadOcupantes, String fechaIngreso, int fila, int columna, int anioFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}


	//Metodos Get y Set
	public int getAnioFabricacion() {
		return anioFabricacion;
	}


	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	}
	
}
