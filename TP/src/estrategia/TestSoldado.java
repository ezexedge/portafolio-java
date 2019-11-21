package estrategia;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestSoldado {
	
	 Soldado soldado = new Soldado(new Ubicacion(2.0));
	 Soldado soldado1 = new Soldado(new Ubicacion(2.0));
	 Soldado soldado2 = new Soldado(new Ubicacion(3.0));
	Unidad caballero = new Caballero(new Ubicacion(2.0));


	@Test
	public void vidaTest() {
		
		
		
		
		Assert.assertEquals(false, soldado.estaMuerto());
		Assert.assertSame(100, soldado.getEnergia());
		Assert.assertTrue(soldado.getSalud() == 200);
		Assert.assertTrue(soldado.getDanio() == 10);

	}
	@Test
	public void equalsTest() {
	
		 
		 
		Assert.assertEquals(true , soldado.equals(soldado1));
		Assert.assertEquals(false , soldado1.equals(soldado2));
		
	
		
	}
	
	@Test
	public void atacarATest() {
		
	
			
		Assert.assertTrue(soldado.puedeAtacar(soldado1));
		Assert.assertFalse(soldado.puedeAtacar(soldado2));
		
	}
	@Test
	public void ataqueTest() throws ExcepcionesAtaque {
		
	
		 
		 soldado.atacarA(soldado1);
		 
		 
		 Assert.assertSame(90 , soldado.getEnergia());
		 Assert.assertTrue(soldado1.getSalud() == 190);
		 
		 caballero.atacarA(soldado2);
		 caballero.atacarA(soldado2);
		 caballero.atacarA(soldado2);
		 caballero.atacarA(soldado2);

		 Assert.assertEquals(true, soldado2.estaMuerto()); 

		 
				 
		 
	}
	

	
	public void bebibleTest() {
		
		
	soldado.recibeAgua();
	
	Assert.assertSame(200,soldado.getEnergia());
		
		
	
		
	}
	
	
	
}
	
	
	


