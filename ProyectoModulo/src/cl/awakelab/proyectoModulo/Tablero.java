package cl.awakelab.proyectoModulo;

import java.util.*;
/*
 * Tablero.java  
 * Clase donde se crea una tablero y se le asigna carros y huevos
 * @author: Fernanda - Javiera - Karen - Andrea
 * @version: 26/02/20
 * 
 */
public class Tablero {

	/*
	 * Array de 15x15
	 * Tenemos una ArrayList de instancias de Carro y una ArrayList de instancia de Huevo
	 * @see Carro @see Huevo
	 */
	private String[][] tablero = new String[15][15];
	ArrayList<Carro> listaCarro = new ArrayList<Carro>();
	ArrayList<Huevo> listaHuevo = new ArrayList<Huevo>();
	
	//METODOS PUBLICOS
	
	/*
	 * Metodo que nos crea 3 tipo de carros: Kromi, Caguano y Trupalla. Cada carro ocupa una cantidad determinada de celdas en el tablero.
	 *@see Carro @see Kromi @see Caguano @see Trupalla 
	 *@see celdaOcupadaKromi @celdaOcupadaCaguano
	 *@param tablero
	 *@param listaCarro
	 *@param armadura
	 */
	public String[][] CrearCarro () {
		int columna;
		int fila;
		Carro c;
		for (int i = 0; i < 3; i++) {		
			columna=(int) (Math.random()*13);
			fila=(int) (Math.random()*12);
			while (celdaOcupadaKromi(fila, columna)) {				
				columna=(int) (Math.random()*13);
				fila=(int) (Math.random()*12);
			}
			tablero[fila][columna]		="K";
			tablero[fila+1][columna]	="K";
			tablero[fila+2][columna]	="K";
			c=new Kromi((int)(Math.random()*15), "25/02/2020", fila, columna, 2019, "loQueSea");
			listaCarro.add(c);
		}
		
		for (int i = 0; i < 5; i++) {		
			int armadura= (int)(Math.random()*5);
			columna=(int) (Math.random()*13);
			fila=(int) (Math.random()*14);
			while (celdaOcupadaCaguano(fila, columna)) {				
				columna=(int) (Math.random()*13);
				fila=(int) (Math.random()*14);
			}
			tablero[fila][columna]		="C";
			tablero[fila][columna+1]	="C";
			c=new Caguano((int)(Math.random()*10), "24/02/2020", fila, columna, armadura, "Paquito");
			listaCarro.add(c);
		}
		
		for (int i = 0; i < 10; i++) {		
			columna=(int) (Math.random()*13);
			fila=(int) (Math.random()*13);
			while (tablero[fila][columna]!=null) {				
				columna=(int) (Math.random()*13);
				fila=(int) (Math.random()*13);
			}
			tablero[fila][columna]="T";
			c=new Trupalla((int)(Math.random()*5), "23/02/2020", fila, columna, 3, "amarillo");
			listaCarro.add(c);
		}
		return tablero;
		
	}
	
	/*
	 * Metodos que nos indica si las celdas estan ocupadas al momento de crear un carro de tipo Kromi
	 * @param tablero
	 */
	
	private boolean celdaOcupadaKromi(int fila, int columna) {
			for (int j = 0; j < 3; j++) {
				if(tablero[fila+j][columna+j]!=null) {
					return true;
				}
			}
			return false;
	}
	
	/*
	 * Metodos que nos indica si las celdas estan ocupadas al momento de crear un carro de tipo Caguano
	 * @param tablero
	 */
	private boolean celdaOcupadaCaguano(int fila, int columna) {
		for (int j = 0; j < 2; j++) {
			if(tablero[fila][columna+j]!=null) {
				return true;
			}
		}
		return false;
	}
	
	
	/*
	 * Metodo que lanza huevos en el tablero y asigna un puntaje cada vez que acierta a un carro
	 * @see Huevo
	 * @param tablero
	 * @param listaHuevo
	 */
	public void lanzarHuevo(int fila, int columna) {
		Huevo h;
		int puntaje=0;
		//le resto 1, ya que si el usuario ingresa fila 5 (por ejemplo), en la matriz seria fila 4, porque comienza en 0
		fila=fila-1;
		columna=columna-1;
		if (tablero[fila][columna]!=null) {
			if(tablero[fila][columna].equalsIgnoreCase("K")){
				puntaje+=3;
				tablero[fila][columna]="H";
				//Antes de preguntar si la Celda X es igual a una H, pregunta si tienen algo dentro, ya que de lo contrario compara un null con un String y arroja error
				if(tablero[fila+1][columna]!=null && tablero[fila+2][columna]!=null) {
					if(tablero[fila+1][columna].equalsIgnoreCase("H") && tablero[fila+2][columna].equalsIgnoreCase("H")) {
						puntaje+=10;
					}
				}
				if(tablero[fila-1][columna]!=null && tablero[fila-2][columna]!=null) {
					if(tablero[fila-1][columna].equalsIgnoreCase("H") && tablero[fila-2][columna].equalsIgnoreCase("H")) {
						puntaje+=10;
					}
				}
				if(tablero[fila-1][columna]!=null && tablero[fila+1][columna]!= null) {
					if(tablero[fila-1][columna].equalsIgnoreCase("H") && tablero[fila+1][columna].equalsIgnoreCase("H")) {
						puntaje+=10;
					}
				}
			}
			if(tablero[fila][columna].equalsIgnoreCase("C")){
				puntaje+=2;
				tablero[fila][columna]="H";
				//pregunta si la columna posterior es diferente a un null, para posteriormente poder comparar un String con un String
				if(tablero[fila][columna+1]!=null) {
					if(tablero[fila][columna+1].equalsIgnoreCase("H")){
						puntaje+=7;
					}
				}
				//pregunta si la columna anterior es diferente a un null, para posteriormente poder comparar un String con un String
				if(tablero[fila][columna-1]!=null) {
					if(tablero[fila][columna-1].equalsIgnoreCase("H")){
						puntaje+=7;
					}
				}
			}
			if(tablero[fila][columna].equalsIgnoreCase("T")){
				puntaje+=1;
				tablero[fila][columna]="H";
			}
		} else {
			tablero[fila][columna]="H";
		}
		h= new Huevo(fila, columna, puntaje);
		listaHuevo.add(h);
	}
	
	
	/*
	 * Metodo que muestra matriz, con carros y/o huevos lanzados
	 * @see puntajeTotal 
	 * @param tablero
	 */
	public String[][] mostrarMatriz() {
		for (int x=0; x < tablero.length; x++) {
			for (int y=0; y < tablero[x].length; y++) {
				if (tablero[x][y] == null) {
						  System.out.print("[ ]");
				  } else {
					 System.out.print("["+ tablero[x][y]+ "]");
				  }
			}
			System.out.println();
		}
		System.out.println("Puntaje total = " + puntajeTotal());
		return tablero;
	}
	
	/*
	 * Metodo que nos imprime las coordenadas de los huevos lanzados
	 * @see Huevo
	 * @param listaHuevo
	 * @param fila 
	 * @param columna
	 */
	public ArrayList<Huevo> mostrarHuevos() {
		System.out.println("Lista de lanzamientos:");
		System.out.println("");
		for (Huevo h : listaHuevo) {
			System.out.println("[fila,columna]: [" + (h.getFila()+1)+","+ (h.getColumna()+1)+"]");
		}
		System.out.println("");
		return listaHuevo;
	}
	
	/*
	 * METODO PRIVADO
	 * Metodo que retorna el puntaje total de los lanzamiento de huevos que aciertan en los diferentes carros
	 * @see Huevo 
	 * @param listaHuevo
	 */
	private int puntajeTotal() {
		int puntajeTotal=0;
		for (Huevo h : listaHuevo) {
			puntajeTotal+= h.getPuntaje();
		}
		return puntajeTotal;
	}
}

