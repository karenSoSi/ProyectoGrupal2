package cl.awakelab.proyectoModulo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestTablero {
	Tablero tablerito = new Tablero();
	String[][] t1;
	@Before
	public void inicializar() {
		t1 = new String[15][15];
	}
	@Test
	public void testCrearCarro() {	
		t1=tablerito.CrearCarro();
		int letrasTotales=0;
		for (int x=0; x < t1.length; x++) {
			for (int y=0; y < t1[x].length; y++) {
				if (t1[x][y] != null) {
					letrasTotales+=1;
				}
			}
		}
		assertTrue(letrasTotales==29, "Metodo crearCarro no esta rellenando la matriz");
	}
	@Test
	public void testLanzarHuevo() {
		t1=tablerito.CrearCarro();
		tablerito.lanzarHuevo(1, 1);
		assertTrue(t1[0][0].equals("H"), "Metodo lanzarHuevo no esta gravando una H en la matriz");	
	}
	@Test
	public void testMostrarMatriz() {
		String[][] n = new String[15][15];	
		 n = tablerito.mostrarMatriz();
		 int mostrar=0;
		for (int x=0; x < n.length; x++) {
			for (int y=0; y <n[x].length; y++) {
				if (n[x][y] == null) {
					mostrar+=1;
				}
			}
		}
		assertTrue(mostrar==225, "Metodo mostrarMatriz no esta mostrando la matriz");
	}
}