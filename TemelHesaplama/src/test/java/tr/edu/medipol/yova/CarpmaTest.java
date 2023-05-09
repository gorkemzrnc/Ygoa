package tr.edu.medipol.yova;
import static org.junit.Assert.*;
import org.junit.Test;
public class CarpmaTest {
	@Test
	public void testCarpma(){
		// GIVEN
		int sayi1 = 3;
		int sayi2 = 2;
		
		// WHEN
		int gercekSonuc = Carpma.islemYap(sayi1,sayi2);
		
		// THEN
		assertEquals(6, gercekSonuc);
	}
}
