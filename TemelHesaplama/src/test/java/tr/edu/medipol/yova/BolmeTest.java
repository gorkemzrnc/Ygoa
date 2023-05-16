package tr.edu.medipol.yova;
import static org.junit.Assert.*;
import org.junit.Test;
public class BolmeTest {
	@Test
	public void testBolme(){
		// GIVEN
		int sayi1 = 5;
		int sayi2 = 1;
		
		// WHEN
		int gercekSonuc = Bolme.islemYap(sayi1,sayi2);
		
		// THEN
		assertEquals(5, gercekSonuc);
	}
}
