package br.com.treinamento.estoque.modelo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Produto {
	
	private Long id;
	
	@NotNull
	@Size(min=3, message="{conta.formulario.descricao.tamanho}")
 	private String descricao;

	private boolean paga;
	
	private double valor;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataPagamento;
	
	private TipoDoProduto tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isPaga() {
		return paga;
	}

	public void setPaga(boolean paga) {
		this.paga = paga;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public TipoDoProduto getTipo() {
		return tipo;
	}

	public void setTipo(TipoDoProduto tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}	
	
	public void setValor(double valor) {
		this.valor = valor;
	}


}
