package test;

import org.junit.jupiter.api.BeforeEach;

import logica.cuenta;

public class cuentaTest {
	private cuenta cuenta;
	
	@BeforeEach
	public void setUp() {
		this.cuenta = new cuenta(4,6000,"a");
	}
	
	@Test
	public void consignar() {
		assertEquals(7000,this.cuenta.consignar(1000);		
	}
	
	@Test
	public void retirar() {
		assertTrue(this.cuenta.retirar(3000));
		assertThrows(Exception.class, () -> {
			this.cuenta.retirar(7000);
		});
	}
}
