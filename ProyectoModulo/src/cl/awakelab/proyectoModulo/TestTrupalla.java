package cl.awakelab.proyectoModulo;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;
class TestTrupalla {
	Trupalla t;
	@Test
	public void testGetNivelArmadura() {
		t=new Trupalla(2, "24/05/2019", 3, 4, 5, "Juan");
		assertEquals(5, t.getNivelArmadura());
	}
	@Test
	public void testGetNombre() {
		t=new Trupalla(2, "24/05/2019", 3, 4, 5, "Juan");
		assertEquals("Juan", t.getNombre());	
	}
	@Test
	public void testSetNivelArmadura() {
		t=new Trupalla(2, "24/05/2019", 3, 4, 5, "Juan");
		t.setNivelArmadura(2);
		assertEquals(2, t.getNivelArmadura());
	}
	@Test
	public void testSetNombre() {
		t=new Trupalla(2, "24/05/2019", 3, 4, 5, "Juan");
		t.setNombre("Pedro");
		assertEquals("Pedro", t.getNombre());
	}
	@Test
	public void testToString() {
		t=new Trupalla(2, "24/05/2019", 3, 4, 5, "Juan");
		assertEquals("Trupalla [nivelArmadura=5, nombre=Juan]", t.toString());
	}
}