package ejecutable;

/*
 * Clase Main. Contiene el menu
 * @author: Fernanda - Javiera - Karen - Andrea
 * @version: 26/02/20
 */

import java.util.*;
import cl.awakelab.proyectoModulo.*;

public class Ejecutable {

	public static void main(String[] args) {
		
	/*
	 * @see Tablero
	 * @see mostrarMatriz 
	 * @see lanzarHuevito
	 * @see CrearCarro
	 * 
	 */
		Tablero tablerito = new Tablero();
		tablerito.CrearCarro();
		boolean salida= false;
		do {				 
			switch (menuOpciones()) {
			case 1:
				//variable para ver si el huevo se lanzo o no
				boolean lanzo=false;
				do {
					lanzo=lanzarHuevitos(tablerito);
				} while (!lanzo);
				break;
			case 2:
				tablerito.mostrarHuevos();
				tablerito.mostrarMatriz();
				break;
			case 3:
				escribir("Hasta pronto!");
				salida= true;
				break;
			default:
				escribir("Opción no válida\nvuelva a intentarlo"
						+ " o presione \"3\" para salir...");
				break;
			}
		}while(!salida);
	}

	/*
	 * Valida si lo que se ingresa dentro del rango 1-15 y sí se ingresa solo numeros con Try/catch
	 * devuelve un True si se lanzo el huevo y False si se ingreso una letra
	 * @see Tablero
	 * @param tablerito
	 */
	public static boolean lanzarHuevitos(Tablero tablerito) {
		int fila=0;
		int columna=0;
		try {
			do {
				fila = pideNumero("Ingrese la coordenada de la fila (numero del 1 al 15):");
				if(fila<1 || fila>15) {
					System.out.println("Numero ingresado fuera de rango...");
				}
			} while (fila<1 || fila>15);
			do {
				columna = pideNumero("Ingrese la coordenada de la columna (numero del 1 al 15):");
				if(columna<1 || columna>15) {
					System.out.println("Numero ingresado fuera de rango...");
				}
			} while(columna<1 || columna >15);			
		} catch (Exception e) {
			System.out.println("Debe ingresar un NUMERO");
			return false;
		}
		tablerito.lanzarHuevo(fila, columna);
		return true;
	}
	
	/*
	 * Metodo que nos muestra el menu
	 * Tiene un Try/Catch para verificar su es un numero lo que se ingresa
	 * en caso de ingresar una vocal, devolvera un 0, por lo que estara fuera de rango
	 */
	
	public static int menuOpciones() {
		try {
			escribir("");
			escribir("Menú del juego");
			escribir("");
			escribir(" 1-. Realizar lanzamientos \n 2-. Mostrar tablero \n"
					+ " 3-. Salir del juego");
			escribir("");
			return pideNumero("Elige una opción: ");
		} catch (Exception e) {
			return 0;
		}
	}
	
	
	/*
	 * Metodo que escribe un mensaje por pantalla
	 * @param mens mensaje que se mostrara por pantalla
	 */
	public static void escribir(String mens) {
		System.out.println(mens);
	}
	
	/*
	 * Metodo que escribir un mensaje por pantalla y consulta numero retornandolo
	 * @param mens mensaje que se mostrara por pantalla
	 * @return retorna numero que se leera
	 */
	public static int pideNumero(String mens) {
		escribir(mens);
		Scanner n= new Scanner(System.in);
		return n.nextInt();
	}
}
