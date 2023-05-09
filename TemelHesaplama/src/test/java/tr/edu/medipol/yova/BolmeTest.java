package tr.edu.medipol.yova;
import static org.junit.Assert.*;
import org.junit.Test;
public class BolmeTest {
	@Test
	public void testBolme(){
		// GIVEN
		double sayi1 = 5;
		double sayi2 = 1;
		
		// WHEN
		double gercekSonuc = Bolme.islemYap(sayi1,sayi2);
		
		// THEN
		assertEquals(5.0, gercekSonuc);
	}
}
