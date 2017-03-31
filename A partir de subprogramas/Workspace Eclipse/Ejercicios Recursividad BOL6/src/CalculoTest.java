import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoTest {

	@Test
	public void test() {
		assertEquals("Prueba Ackermann (2,2)", 7, Calculo.funcionAckerman(2, 2), 0.000001);
		assertEquals(1, Calculo.funcionAckerman(0, 0), 0.003);

	}

}
