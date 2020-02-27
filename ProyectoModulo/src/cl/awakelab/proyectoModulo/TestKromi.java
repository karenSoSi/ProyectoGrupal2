package cl.awakelab.proyectoModulo;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
class TestKromi {
	Kromi k;
	@Test
	public void testGetAnioFabricacion() {
		k=new Kromi(2, "24/05/2019", 3, 4, 2018,  "pollito");
		assertEquals(2018, k.getAnioFabricacion());
	}
	@Test
	public void testGetMarca() {
		k=new Kromi(2, "24/05/2019", 3, 4, 2018,  "pollito");
		assertEquals("pollito", k.getMarca());
	}
	@Test
	public void testSetAnioFabricacion() {
		k=new Kromi(2, "24/05/2019", 3, 4, 2018,  "pollito");
		k.setAnioFabricacion(2020);
		assertEquals(2020, k.getAnioFabricacion());
	}
	@Test
	public void testSetMarca() {
		k=new Kromi(2, "24/05/2019", 3, 4, 2018,  "pollito");
		k.setMarca("piolin");
		assertEquals("piolin", k.getMarca());
	}
	@Test
	public void testToString() {
		k=new Kromi(2, "24/05/2019", 3, 4, 2018,  "pollito");
		assertEquals("Kromi [anioFabricacion=2018, marca=pollito]", k.toString());
	}
}