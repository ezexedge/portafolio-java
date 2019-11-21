package estrategia;

import org.junit.Test;

import junit.framework.Assert;

public class TestCaballeros {

	Caballero caballero = new Caballero(new Ubicacion(1.0));
	
	Caballero caballero1 =  new Caballero(new Ubicacion(2.0));
	
	Caballero caballero2 = new Caballero(new Ubicacion(1.0));
	Caballero caballero3 =  new Caballero(new Ubicacion(2.0));
	

	@Test
	public void vidaTest() {
		
		
		
		
		Assert.assertEquals(false, caballero.estaMuerto());
		Assert.assertSame(0, caballero.getCantAtaques());
		Assert.assertTrue(caballero.getSalud() == 200);
		Assert.assertTrue(caballero.getDanio() == 50);
		Assert.assertSame(false,  caballero.caballoRebelado());


	}
	@Test
	public void equalsTest() {
	
		 
		 
		Assert.assertEquals(true , caballero.equals(caballero2));
		Assert.assertEquals(false , caballero.equals(caballero1));
		
	
		
	}
	
	@Test
	public void atacarATest() {
		
	
			
		Assert.assertTrue(caballero.puedeAtacar(caballero1));
		Assert.assertFalse(caballero.puedeAtacar(caballero2));
		
	}
	@Test
	public void ataqueTest() throws ExcepcionesAtaque {
		
	
		 
		 caballero.atacarA(caballero1);
		 
		 
		 Assert.assertSame(1 , caballero.getCantAtaques());
		 Assert.assertTrue(caballero1.getSalud() == 150);
		 
		 
		 caballero.atacarA(caballero1);
		 caballero.atacarA(caballero1);
		 
		 caballero.atacarA(caballero1);
		 
 
		 	Assert.assertTrue(caballero1.estaMuerto());
			Assert.assertFalse(caballero.puedeAtacar(caballero3));
			
			Assert.assertSame(true,  caballero.caballoRebelado());
			
			
			caballero.recibeAgua();
			Assert.assertTrue(caballero.puedeAtacar(caballero3));

			

		 
				 
		 
	}
	

	
	
	


}
