package estrategia;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestArquero {

	
	Arquero arquero = new Arquero(new Ubicacion(1.0));
	Arquero arquero1 = new Arquero(new Ubicacion(3.0,3.0));
	Arquero arquero2 = new Arquero(new Ubicacion(1.0));
	Unidad caballero = new Caballero(new Ubicacion(0.0));

	
	@Test
	public void vidaTest() {
		
		
			
		Assert.assertEquals(false, arquero.estaMuerto());
		Assert.assertTrue(arquero.getSalud() == 50);
		Assert.assertTrue(arquero.getDanio() == 5);
		Assert.assertTrue(arquero.getCantFlechas() == 20);

	}
	@Test
	public void equalsTest() {
	
		 
		 
		Assert.assertEquals(true , arquero.equals(arquero2));
		Assert.assertEquals(false , arquero1.equals(arquero2));
		
	
		
	}
	
	@Test
	public void atacarATest() {
		
	
			
		Assert.assertTrue(arquero.puedeAtacar(arquero1));
		Assert.assertFalse(arquero.puedeAtacar(arquero2));
		
	}
	@Test
	public void ataqueTest() throws ExcepcionesAtaque {
		
		
		 arquero.atacarA(arquero1);
		 
		 
		 Assert.assertSame(19 , arquero.getCantFlechas());
		 Assert.assertTrue(arquero1.getSalud() == 45);
		 
		 
		 caballero.atacarA(arquero2);
		 
		 Assert.assertEquals(true, arquero2.estaMuerto()); 

		 	 
		 
	}
	
	
	
	public void recargoFlechasTest() {
		
		
	arquero.recargarFlechas();
	
	Assert.assertSame(25,arquero.getCantFlechas());
		
		
	
		
	}
	
	
	

}
