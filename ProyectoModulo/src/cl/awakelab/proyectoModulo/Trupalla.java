package cl.awakelab.proyectoModulo;

public class Trupalla extends Carro {

	
	private int nivelArmadura;
	private String nombre;
	
	
	//CONSTRUCTOR
	public Trupalla(int cantidadOcupantes, String fechaIngreso, int fila, int columna, int nivelArmadura,
			String nombre) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.nivelArmadura = nivelArmadura;
		this.nombre = nombre;
	}

	//GET AND SET
	public int getNivelArmadura() {
		return nivelArmadura;
	}


	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//toString
	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombre=" + nombre + "]";
	}
	
	
	
}
