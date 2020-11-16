
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrangeTest {

	
	@Test
	public void testOrangeEquiv() {
		Orange orange1= new Orange(10,"France");
		Orange orange2= new Orange(10,"France"); 
		assertEquals(true,orange1.equals(orange1,orange2));		
	}

	@Test
	public void testOrangePasEquiv() {
		Orange orange1= new Orange(10,"France");
		Orange orange2= new Orange(20,"France"); 
		assertEquals(false, orange1.equals(orange1,orange2));	
	}
}
