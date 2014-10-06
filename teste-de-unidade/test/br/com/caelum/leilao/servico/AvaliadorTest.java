package br.com.caelum.leilao.servico;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.caelum.leilao.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Avaliador;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class AvaliadorTest {
	
	private Avaliador leiloeiro;
	private Usuario joao;
	private Usuario jose;
	private Usuario maria;
	
	
	@Before
	public void criaAvaliador(){
		this.leiloeiro = new Avaliador();
		this.joao = new Usuario("Joao");
		this.jose = new Usuario("Jose");
		this.maria = new Usuario("Maria");
	}

	@Test(expected=RuntimeException.class)
	public void naoDeveAvaliarLeiloesSemNenhumLanceDado() {
	    Leilao leilao = new CriadorDeLeilao()
	        .para("Playstation 3 Novo")
	        .constroi();

	    leiloeiro.avalia(leilao);
	}
	
	@Test
	public void deveEntenderLancesEmOrdemCrescente(){
		
		Leilao leilao = new Leilao("PlayStation 4");
		
		leilao.propoe(new Lance(maria, 300.0));
		leilao.propoe(new Lance(joao, 400.0));
		leilao.propoe(new Lance(jose, 500.0));
		
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 500;
		double menorEsperado = 300;
		
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);

	}
	
	@Test
	public void deveCalcularAMedia(){

		Leilao leilao = new Leilao("PlayStation 4");
		
		leilao.propoe(new Lance(maria, 300.0));
		leilao.propoe(new Lance(joao, 400.0));
		leilao.propoe(new Lance(jose, 500.0));
		
		leiloeiro.avalia(leilao);
				
		Assert.assertEquals(400, leiloeiro.getMedia(), 0.0001);
	}
	
	@Test
	public void deveEntenderLanceComApenasUmLance(){
		Leilao leilao = new Leilao("Playstation");
		
		leilao.propoe(new Lance(joao, 1000.0));
		
		leiloeiro.avalia(leilao);
		
		assertEquals(1000.0, leiloeiro.getMaiorLance(), 0.0001);
		
	}
	
	@Test
	public void deveEntenderLancesEmOrdemAleatoria(){
		
		Leilao leilao = new Leilao("Carro");
				
		leilao.propoe(new Lance(joao, 200));
		leilao.propoe(new Lance(maria, 450));
		leilao.propoe(new Lance(joao, 120));
		leilao.propoe(new Lance(maria, 700));
		leilao.propoe(new Lance(joao, 630));
			
		leiloeiro.avalia(leilao);
		
		assertEquals(700, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(120, leiloeiro.getMenorLance(), 0.0001);
		
	}
	
	
	@Test
	public void deveEntenderLancesEmOrdemDecrescente(){
		
		Leilao leilao = new Leilao("Carro");
				
		leilao.propoe(new Lance(joao, 400));
		leilao.propoe(new Lance(maria, 300));
		leilao.propoe(new Lance(joao, 200));
		leilao.propoe(new Lance(maria, 100));
		leilao.propoe(new Lance(joao, 0));
		
		leiloeiro.avalia(leilao);

		assertEquals(400, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(0, leiloeiro.getMenorLance(), 0.0001);
	}
	
	@Test
	public void deveEncontrarOsTresMaioresLances(){
		
		Leilao leilao = new CriadorDeLeilao().para("Computador")
				.lance(joao, 100.0)
				.lance(maria, 200.0)
				.lance(joao, 300.0)
				.lance(maria, 400.0)
				.constroi();		
		
		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		
		assertEquals(3, maiores.size());
		assertEquals(400, maiores.get(0).getValor(), 0.0001);
		assertEquals(300, maiores.get(1).getValor(), 0.0001);
		assertEquals(200, maiores.get(2).getValor(), 0.0001);

	}
	
	@Test
	public void deveEncontrarOsDoisUnicosLances	(){
		
		Leilao leilao = new Leilao("Computador Petium3");
				
		leilao.propoe(new Lance(joao, 400));
		leilao.propoe(new Lance(maria, 300));
	
		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		
		assertEquals(2, maiores.size());
		assertEquals(400, maiores.get(0).getValor(), 0.0001);
		assertEquals(300, maiores.get(1).getValor(), 0.0001);

	}
	
	@Test
	public void deveEncontrarListaVazia(){
		
		Leilao leilao = new Leilao("NotBook Petium3");
					
		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		
		assertEquals(0, maiores.size());

	}
	
}
