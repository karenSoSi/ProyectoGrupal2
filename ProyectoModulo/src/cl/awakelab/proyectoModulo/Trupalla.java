package cl.awakelab.proyectoModulo;
/*
 * Clase hija de Carro. Hereda sus atributos
 * @author: Fernanda - Javiera - Karen - Andrea 
 * @version: 24/02/2020 
 */
public class Trupalla extends Carro {

	
	private int nivelArmadura;
	private String nombre;
	
	
	/*
	 * Constructor con 3 parametros heredados de la clase Carro y 2 propios
	 * @see Carro
	 * @param cantidadOcupantes parametro que hereda de la clase padre "Carro"
	 * @param fechaIngreso parametro que hereda de la clase padre "Carro"
	 * @param fila @param columna parametro que hereda de la clase padre "Carro"
	 * @param armadura nivel de armadura que tendra el carro Trupalla (lvl 1 a 5)
	 * @param nombre nombre de la person que manipula los carro Trupalla
	 */
	public Trupalla(int cantidadOcupantes, String fechaIngreso, int fila, int columna, int nivelArmadura,
			String nombre) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.nivelArmadura = nivelArmadura;
		this.nombre = nombre;
	}

	//Metodos Get y Set
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

	//Metodo toString
	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombre=" + nombre + "]";
	}
	
	
	
}
