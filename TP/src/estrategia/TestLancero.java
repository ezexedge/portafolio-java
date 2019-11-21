package estrategia;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestLancero {

	Lancero lancero = new Lancero(new Ubicacion(1.0));
	Lancero lancero1 = new Lancero(new Ubicacion(2.0,3.0));
	Lancero lancero2 =  new Lancero(new Ubicacion(1.0));
	Lancero lancero3 =  new Lancero(new Ubicacion(20.0 , 100.0));
	Unidad caballero = new Caballero(new Ubicacion(0.0));
	
	
	
	@Test
	public void vidaTest() {
		
		
		
		
		Assert.assertEquals(false, lancero.estaMuerto());
		Assert.assertTrue(lancero.getSalud() == 150);
		Assert.assertTrue(lancero.getDanio() == 25);
		

	}
	@Test
	public void equalsTest() {
	
		 
		 
		Assert.assertEquals(true , lancero.equals(lancero2));
		Assert.assertEquals(false , lancero1.equals(lancero));
		
		

		
	}
	
	@Test
	public void atacarATest() {
		
	
			
		Assert.assertTrue(lancero.puedeAtacar(lancero1));
		Assert.assertFalse(lancero.puedeAtacar(lancero2));
		Assert.assertFalse(lancero.puedeAtacar(lancero3));
		
		
	}
	@Test
	public void ataqueTest() throws ExcepcionesAtaque {
		
	
		 
		 lancero.atacarA(lancero1);
		 
	
		 Assert.assertTrue(lancero1.getSalud() == 125);
		 
		 caballero.atacarA(lancero);
		 caballero.atacarA(lancero);
		 caballero.atacarA(lancero);
		 Assert.assertEquals(true, lancero.estaMuerto()); 
		 
		 	 
		 
	}
	

	

}
