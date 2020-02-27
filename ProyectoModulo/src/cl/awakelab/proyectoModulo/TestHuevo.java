package cl.awakelab.proyectoModulo;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TestHuevo {
	Huevo h;
	@Test
	public void testGetFila() {
		h=new Huevo(2, 12, 10);
		assertEquals(2, h.getFila());
	}
	@Test
	public void testGetColumna() {
		h=new Huevo(2, 12, 10);
		assertEquals(12, h.getColumna());
	}
	@Test
	public void testGetPuntaje() {
		h=new Huevo(2, 12, 10);
		assertEquals(10, h.getPuntaje());
	}
	@Test
	public void testToString() {
		h=new Huevo(2, 12, 10);
		assertEquals("Huevo [fila=2, columna=12, puntaje=10]", h.toString());
	}
}