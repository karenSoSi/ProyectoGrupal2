package cl.awakelab.proyectoModulo;

import java.util.*;

public class Tablero {

	ArrayList listaCarro = new ArrayList();
	ArrayList listaHuevo = new ArrayList();
	private String[][] tablero = new String[15][15];
	
	
	public Tablero() {
		
	}
	
	
	//METODOS
	public void CrearCarro () {
		int columna;
		int fila;
		Carro c;
		//Crea un carro Kromi
		for (int i = 0; i < 3; i++) {		
			columna=(int) (Math.random()*14);
			fila=(int) (Math.random()*12);
			while (celdaOcupadaKromi(fila, columna)) {				
				columna=(int) (Math.random()*14);
				fila=(int) (Math.random()*12);
			}
			tablero[fila][columna]		="K";
			tablero[fila+1][columna]	="K";
			tablero[fila+2][columna]	="K";
			c=new Kromi((int)(Math.random()*15), "25/02/2020", fila, columna, 2019, "loQueSea");
			listaCarro.add(c);
		}
		//Crea un Carro Caguano
		for (int i = 0; i < 5; i++) {		
			columna=(int) (Math.random()*13);
			fila=(int) (Math.random()*14);
			while (celdaOcupadaCaguano(fila, columna)) {				
				columna=(int) (Math.random()*13);
				fila=(int) (Math.random()*14);
			}
			tablero[fila][columna]		="C";
			tablero[fila][columna+1]	="C";
			c=new Caguano((int)(Math.random()*15), "25/02/2020", fila, columna, 3, "amarillo");
			listaCarro.add(c);
		}
		
		//Crea un Carro Trupalla
		for (int i = 0; i < 10; i++) {		
			columna=(int) (Math.random()*14);
			fila=(int) (Math.random()*14);
			while (tablero[fila][columna]!=null) {				
				columna=(int) (Math.random()*13);
				fila=(int) (Math.random()*14);
			}
			tablero[fila][columna]="T";
			c=new Trupalla((int)(Math.random()*5), "23/02/2020", fila, columna, (int)(Math.random()*5+1), "Gaston");
			listaCarro.add(c);
		}	
	}
	
	
	private boolean celdaOcupadaKromi(int fila, int columna) {
		for (int j = 0; j < 3; j++) {
			if(tablero[fila+j][columna]!=null) {
				return true;
			}
		}
		return false;
	}

	
	private boolean celdaOcupadaCaguano(int fila, int columna) {
		for (int j = 0; j < 5; j++) {
			if(tablero[fila][columna+j]!=null) {
				return true;
			}
		}
		return false;
	}
	
	public void lanzarHuevo(int fila, int columna) {
		Huevo h;
		int puntaje=0;
		if(tablero[fila][columna].equalsIgnoreCase("K")){
			puntaje+=3;
			tablero[fila][columna]="H";
			if(tablero[fila+1][columna].equalsIgnoreCase("H") && tablero[fila+2][columna].equalsIgnoreCase("H")) {
				puntaje+=10;
			}
			if(tablero[fila-1][columna].equalsIgnoreCase("H") && tablero[fila-2][columna].equalsIgnoreCase("H")) {
				puntaje+=10;
			}
			if(tablero[fila-1][columna].equalsIgnoreCase("H") && tablero[fila+1][columna].equalsIgnoreCase("H")) {
				puntaje+=10;
			}	
		}else {
			if(tablero[fila][columna].equalsIgnoreCase("C")){
				puntaje+=2;
				tablero[fila][columna]="H";
				if(tablero[fila][columna+1].equalsIgnoreCase("H") && tablero[fila][columna+2].equalsIgnoreCase("H")) {
					puntaje+=7;
				}	
			}else {
					if(tablero[fila][columna].equalsIgnoreCase("T")){
						puntaje+=1;
						tablero[fila][columna]="H";
					}else {
						tablero[fila][columna]="H";
				}
			}
		}
		h=new Huevo(fila, columna, puntaje);
		listaHuevo.add(h);

	}
	
	/*Mostrar Matriz: este método debe mostrar en forma de matriz cada uno de los carros existentes, 
	 * y  los  lanzamientos  que  se  han  registrado  hasta el  momento. 
	 * Recuerde  que  donde  hubo  un  lanzamiento  debe  haber  una  letra  “H”, 
	 * independiente de si acierta a un carro o no. Una vez que realiza la acción, 
	 * debe calcular el puntaje obtenido hasta el momento.
	 */
	
	public void mostrarMatriz() {
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				if(tablero[i][j].equalsIgnoreCase("K") || tablero[i][j].equalsIgnoreCase("C") || tablero[i][j].equalsIgnoreCase("T")) {
					System.out.println("["+tablero[i][j]+"]" );
				}else {
					System.out.println("[ ]");
				}
				
				if(j==14) {
					System.out.println("\n");
				}
			}
		}
		
	}
	

}
