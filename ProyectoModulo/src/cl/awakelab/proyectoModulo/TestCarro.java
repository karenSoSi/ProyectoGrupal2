package cl.awakelab.proyectoModulo;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestCarro {
	Carro c;
	@Before
	public void inicializacion() {
		c=new Carro(2, "24/05/2019", 3, 4 );
	}
	@Test
	public void testGetCantidadOcupantes() {
		assertEquals(2, c.getCantidadOcupantes());
	}
	@Test
	public void testGetFechaIngreso() {
		assertEquals("24/05/2019", c.getFechaIngreso());
	}
	@Test
	public void testGetFila() {
		assertEquals(3, c.getFila());
	}
	@Test
	public void testGetColumna() {
		assertEquals(4, c.getColumna());
	}
	@Test
	public void testSetCantidadOcupantes() {
		c.setCantidadOcupantes(5);
		assertEquals(5, c.getCantidadOcupantes());
	}
	@Test
	public void testSetFechaIngreso() {
		c.setFechaIngreso("01/03/1994");
		assertEquals("01/03/1994", c.getFechaIngreso());
	}
	@Test
	public void testSetFila() {
		c.setFila(6);
		assertEquals(6, c.getFila());
	}
	@Test
	public void testSetColumna() {
		c.setColumna(1);
		assertEquals(1, c.getColumna());
	}
	@Test
	public void testToString() {
		assertEquals("Carro [cantidadOcupantes=2, fechaIngreso=24/05/2019, fila=3, columna=4]", c.toString());
	}
}
