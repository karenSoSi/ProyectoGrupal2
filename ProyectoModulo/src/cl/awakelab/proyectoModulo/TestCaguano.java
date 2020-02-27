package cl.awakelab.proyectoModulo;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;
class TestCaguano {
	Caguano c;
	@Test
	public void testGetAlcanceTiro() {
		c=new Caguano(15, "12/02/2002", 5, 3, 5, "amarillo");
		assertEquals(5, c.getAlcanceTiro());
	}
	@Test
	public void testGetColor() {
		c=new Caguano(15, "12/02/2002", 5, 3, 5, "amarillo");
		assertEquals("amarillo", c.getColorConfeti());	
	}
	@Test
	public void testSetAlcanTiro() {
		c=new Caguano(15, "12/02/2002", 5, 3, 5, "amarillo");
		c.setAlcanceTiro(7);
		assertEquals(7, c.getAlcanceTiro());
	}
	@Test
	public void testSetColorConfeti() {
		c=new Caguano(15, "12/02/2002", 5, 3, 5, "amarillo");
		c.setColorConfeti("Azul");
		assertEquals("Azul", c.getColorConfeti());
	}
	@Test
	public void testToString() {
		c=new Caguano(15, "12/02/2002", 5, 3, 5, "amarillo");
		assertEquals("Caguano [alcanceTiro=5, colorConfeti=amarillo]", c.toString());
	}
}