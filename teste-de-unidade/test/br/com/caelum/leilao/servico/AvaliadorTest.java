package br.com.caelum.leilao.servico;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Avaliador;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class AvaliadorTest {

	@Test
	public void deveEntenderLancesEmOrdemCrescente(){
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("PlayStation 4");
		
		leilao.propoe(new Lance(maria, 300.0));
		leilao.propoe(new Lance(joao, 400.0));
		leilao.propoe(new Lance(jose, 500.0));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 500;
		double menorEsperado = 300;
		
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.0001);

	}
	
	@Test
	public void deveCalcularAMedia(){
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("PlayStation 4");
		
		leilao.propoe(new Lance(maria, 300.0));
		leilao.propoe(new Lance(joao, 400.0));
		leilao.propoe(new Lance(jose, 500.0));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
				
		Assert.assertEquals(400, leiloeiro.getMedia(), 0.0001);
	}
	
	@Test
	public void deveEntenderLanceComApenasUmLance(){
		Usuario joao = new Usuario("Joao");
		Leilao leilao = new Leilao("Playstation");
		
		leilao.propoe(new Lance(joao, 1000.0));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		assertEquals(1000.0, leiloeiro.getMaiorLance(), 0.0001);
		
	}
	
	@Test
	public void deveEntenderLancesEmOrdemAleatoria(){
		
		Usuario joao = new Usuario("joao");
		Usuario maria = new Usuario("maria");
		
		Leilao leilao = new Leilao("Carro");
				
		leilao.propoe(new Lance(joao, 200));
		leilao.propoe(new Lance(maria, 450));
		leilao.propoe(new Lance(joao, 120));
		leilao.propoe(new Lance(maria, 700));
		leilao.propoe(new Lance(joao, 630));
		
		Avaliador avaliador = new Avaliador();
		
		avaliador.avalia(leilao);
		
		assertEquals(700, avaliador.getMaiorLance(), 0.0001);
		assertEquals(120, avaliador.getMenorLance(), 0.0001);
		
	}
	
	
	@Test
	public void deveEntenderLancesEmOrdemDecrescente(){
		
		Usuario joao = new Usuario("joao");
		Usuario maria = new Usuario("maria");
		
		Leilao leilao = new Leilao("Carro");
				
		leilao.propoe(new Lance(joao, 400));
		leilao.propoe(new Lance(maria, 300));
		leilao.propoe(new Lance(joao, 200));
		leilao.propoe(new Lance(maria, 100));
		leilao.propoe(new Lance(joao, 0));
		
		Avaliador avaliador = new Avaliador();
		
		avaliador.avalia(leilao);

		assertEquals(400, avaliador.getMaiorLance(), 0.0001);
		assertEquals(0, avaliador.getMenorLance(), 0.0001);
	}
	
	@Test
	public void deveEncontrarOsTresMaioresLances(){
		
		Usuario joao = new Usuario("joao");
		Usuario maria = new Usuario("maria");
		
		Leilao leilao = new Leilao("Computador");
				
		leilao.propoe(new Lance(joao, 400));
		leilao.propoe(new Lance(maria, 300));
		leilao.propoe(new Lance(joao, 200));
		leilao.propoe(new Lance(maria, 100));
		leilao.propoe(new Lance(joao, 800));
		
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		List<Lance> maiores = avaliador.getTresMaiores();
		
		assertEquals(3, maiores.size());
		assertEquals(800, maiores.get(0).getValor(), 0.0001);
		assertEquals(400, maiores.get(1).getValor(), 0.0001);
		assertEquals(300, maiores.get(2).getValor(), 0.0001);

	}
	
	@Test
	public void deveEncontrarOsDoisUnicosLances(){
		
		Usuario joao = new Usuario("joao");
		Usuario maria = new Usuario("maria");
		
		Leilao leilao = new Leilao("Computador Petium3");
				
		leilao.propoe(new Lance(joao, 400));
		leilao.propoe(new Lance(maria, 300));
	
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		List<Lance> maiores = avaliador.getTresMaiores();
		
		assertEquals(2, maiores.size());
		assertEquals(400, maiores.get(0).getValor(), 0.0001);
		assertEquals(300, maiores.get(1).getValor(), 0.0001);

	}
	
	@Test
	public void deveEncontrarListaVazia(){
		
		Leilao leilao = new Leilao("NotBook Petium3");
					
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		List<Lance> maiores = avaliador.getTresMaiores();
		
		assertEquals(0, maiores.size());

	}

}
