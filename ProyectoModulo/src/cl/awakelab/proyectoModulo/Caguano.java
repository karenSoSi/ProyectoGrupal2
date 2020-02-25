package cl.awakelab.proyectoModulo;

public class Caguano extends Carro {

	//ATRIBUTOS
	private int alcanceTiro;
	private String colorConfeti;
	
	
	//CONSTRUCTOR
	public Caguano(int cantidadOcupantes, String fechaIngreso, int fila, int columna, int alcanceTiro,
			String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}


	//GET AND SET
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
