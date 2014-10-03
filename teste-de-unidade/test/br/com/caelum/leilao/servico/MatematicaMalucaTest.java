package br.com.caelum.leilao.servico;


import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.leilao.dominio.MatematicaMaluca;

public class MatematicaMalucaTest {
	
	@Test
	public void deveMultiplicarNumeroMaiorQueTrinta(){
		
		MatematicaMaluca matematica = new MatematicaMaluca();
		
		Assert.assertEquals(31*4, matematica.contaMaluca(31));	
	}
	
	@Test
	public void deveMultiplicarNumeroMaiorQueDez(){
		
		MatematicaMaluca matematica = new MatematicaMaluca();

		Assert.assertEquals(11*3, matematica.contaMaluca(11));	
	}
	
	@Test
	public void deveMultiplicarNumeroMenorQueDez(){
		
		MatematicaMaluca matematica = new MatematicaMaluca();
		
		Assert.assertEquals(5*2, matematica.contaMaluca(5));	

	}
		
	

}
