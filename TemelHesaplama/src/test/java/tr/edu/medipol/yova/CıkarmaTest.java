package tr.edu.medipol.yova;
import static org.junit.Assert.*;
import org.junit.Test;
public class CıkarmaTest {
	@Test
	public void testCıkarma(){
		// GIVEN
		int sayi1 = 2;
		int sayi2 = 1;
		
		// WHEN
		int gercekSonuc = Cikarma.islemYap(sayi1,sayi2);
		
		// THEN
		assertEquals(1, gercekSonuc);
	}
}
