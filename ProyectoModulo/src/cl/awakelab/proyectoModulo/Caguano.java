package cl.awakelab.proyectoModulo;
/*
 * Clase hija de Carro. Hereda sus atributos
 * @author: Fernanda - Javiera - Karen - Andrea 
 * @version: 24/02/2020 
 */
public class Caguano extends Carro {

	//ATRIBUTOS
	private int alcanceTiro;
	private String colorConfeti;
	
	
	/*
	 * Constructor con 3 parametros heredados de la clase Carro y 2 propios
	 * @see Carro
	 * @param cantidadOcupantes parametro que hereda de la clase padre "Carro"
	 * @param fechaIngreso parametro que hereda de la clase padre "Carro"
	 * @param fila @param columna parametro que hereda de la clase padre "Carro"
	 * @param alcanceTiro alcance que tendra los tiros de confeti
	 * @param colorConfeti color del confeti
	 */
	public Caguano(int cantidadOcupantes, String fechaIngreso, int fila, int columna, int alcanceTiro,
			String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}


	//Metodos Get y Set
	public int getAlcanceTiro() {
		return alcanceTiro;
	}


	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}


	public String getColorConfeti() {
		return colorConfeti;
	}


	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}


	//toString
	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	
	
	
	
}
