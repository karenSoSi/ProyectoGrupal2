package cl.awakelab.proyectoModulo;



public class Kromi extends Carro {

	//ATRIBUTOS
	private int anioFabricacion;
	private String marca;
	
	
	//CONSTRUCTOR
	public Kromi(int cantidadOcupantes, String fechaIngreso, int fila, int columna, int anioFabricacion, String marca) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.anioFabricacion = anioFabricacion;
		this.marca = marca;
	}


	//GET AND SET
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

	//toString
	@Override
	public String toString() {
		return "Kromi [anioFabricacion=" + anioFabricacion + ", marca=" + marca + "]";
	}
	
}
